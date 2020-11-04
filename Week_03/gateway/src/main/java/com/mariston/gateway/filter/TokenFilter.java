package com.mariston.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/4 23:52
 */
@Slf4j
@Builder
@NoArgsConstructor
public class TokenFilter implements IFilter {

    @Override
    public void doFilter(FullHttpRequest fullHttpRequest, ChannelHandlerContext ctx) {
        HttpHeaders httpHeaders = fullHttpRequest.headers();
        httpHeaders.add("token", RandomStringUtils.random(12));
    }
}
