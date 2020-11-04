package com.mariston.gateway.server;

import com.mariston.gateway.filter.TokenFilter;
import com.mariston.gateway.inbound.HttpInboundHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.epoll.EpollChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/4 22:46
 */
@Slf4j
@Component
public class GatewayServer implements InitializingBean {

    @Value("${netty.boss.num:1}")
    private int bossNum;

    @Value("${netty.worker.num:10}")
    private int workerNum;

    @Value("${netty.server.port:8888}")
    private int port;

    public void run() throws Exception {

        EventLoopGroup bossGroup = new NioEventLoopGroup(bossNum);

        EventLoopGroup workerGroup = new NioEventLoopGroup(workerNum);

        try {
            ServerBootstrap server = new ServerBootstrap();
            //配置
            server.option(ChannelOption.SO_BACKLOG, 128)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .option(ChannelOption.SO_KEEPALIVE, true)
                    .option(ChannelOption.SO_REUSEADDR, true)
                    .option(ChannelOption.SO_SNDBUF, 32 * 1024)
                    .option(ChannelOption.SO_RCVBUF, 32 * 1024)
                    .option(EpollChannelOption.SO_REUSEPORT, true)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
            //设置Reactor
            server.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.DEBUG))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline p = ch.pipeline();

                            p.addLast(new HttpServerCodec());
                            //p.addLast(new HttpServerExpectContinueHandler());
                            p.addLast(new HttpObjectAggregator(1024 * 1024));
                            p.addLast(new HttpInboundHandler().addFilter(TokenFilter.builder().build()));
                        }
                    });
            Channel ch = server.bind(port).sync().channel();
            log.info("开启netty http服务器，监听地址和端口为 http://127.0.0.1:" + port + '/');
            ch.closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.run();
    }
}
