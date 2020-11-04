package com.mariston.gateway.inbound;

import com.mariston.gateway.filter.IFilter;
import com.mariston.gateway.outbound.httpclient.HttpOutboundHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/4 23:30
 */
@Slf4j
public class HttpInboundHandler extends ChannelInboundHandlerAdapter {

    private List<IFilter> filterList = new ArrayList<>();

    private HttpOutboundHandler httpOutboundHandler;

    public HttpInboundHandler() {
        httpOutboundHandler = new HttpOutboundHandler();
    }

    /**
     * Calls {@link ChannelHandlerContext#fireChannelRead(Object)} to forward
     * to the next {@link ChannelInboundHandler} in the {@link ChannelPipeline}.
     * <p>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if (msg instanceof FullHttpRequest && !CollectionUtils.isEmpty(filterList)) {
            FullHttpRequest request = (FullHttpRequest) msg;
            //filters
            filterList.forEach(filter -> filter.doFilter(request, ctx));
            //out handler
            httpOutboundHandler.handle(request,ctx);

        }
    }

    /**
     * Calls {@link ChannelHandlerContext#fireChannelReadComplete()} to forward
     * to the next {@link ChannelInboundHandler} in the {@link ChannelPipeline}.
     * <p>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    public HttpInboundHandler addFilter(IFilter filter) {
        filterList.add(filter);
        return this;
    }
}
