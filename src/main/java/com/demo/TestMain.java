package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        MyFeignClinet myFeignClinet = applicationContext.getBean(MyFeignClinet.class);
        System.out.println(myFeignClinet.say());
    }
}
