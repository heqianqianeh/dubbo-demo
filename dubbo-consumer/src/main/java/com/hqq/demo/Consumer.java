package com.hqq.demo;

import com.hqq.service.impl.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Package: com.hqq.demo
 * User: 何芊芊
 * Email: heqianqian1@jd.com
 * Date: 2017/12/22
 * Time: 10:43
 * Description:
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-client.xml");
        context.start();
        System.out.println("Consumer Start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("Consumer");
        System.out.println(demoService.echName("heqianqian"));
    }
}
