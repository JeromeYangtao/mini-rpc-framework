package com.github.mianyun.rpc.server;

import com.github.mianyun.rpc.hello.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: mianyun.yt
 * @Date: 2022/3/28
 */
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(String name) {

        logger.info("接收参数：{}", name);

        String result = "hello " + name;

        logger.info("返回数据: {}", result);

        return result;
    }
}
