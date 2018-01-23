package com.dr.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start...");
        DemoService service=context.getBean(DemoService.class);
        System.out.println("get server >>");
        System.out.println(service.welcome("dengrong",new Date()));
    }
}
