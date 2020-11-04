package com.mariston.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/4 23:23
 */
public interface IFilter {

    void doFilter(FullHttpRequest fullHttpRequest, ChannelHandlerContext ctx);

}
