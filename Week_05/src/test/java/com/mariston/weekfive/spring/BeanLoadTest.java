package com.mariston.weekfive.spring;

import com.google.gson.Gson;
import com.mariston.weekfive.bean.User;
import com.mariston.weekfive.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:02
 */
public class BeanLoadTest {

    /**
     * xml 文件加载
     */
    @Test
    public void xmlLoad() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
        UserService userService = context.getBean(UserService.class);
        List<User> users = userService.queryAll();
        Gson gson = new Gson();
        System.out.println(gson.toJson(users));
    }
}
