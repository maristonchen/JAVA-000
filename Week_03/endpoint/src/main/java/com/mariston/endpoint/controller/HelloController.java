package com.mariston.endpoint.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/4 22:36
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("hello")
    public String hello(HttpServletRequest request, String name) {
        System.out.println(request.getHeader("token"));
        return String.format("hello %s", name);
    }
}
