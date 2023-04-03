package com.demo;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class DodoFactoryBean implements FactoryBean<MyFeignClinet> {


    @Override
    public MyFeignClinet getObject() {
        MyFeignClinet myFeignClinet = (MyFeignClinet)Proxy.newProxyInstance(MyFeignClinet.class.getClassLoader(), new Class[]{MyFeignClinet.class},(proxy,method,args)->{
            return "hello world";
        });
        return myFeignClinet;
    }

    @Override
    public Class<?> getObjectType() {
        return MyFeignClinet.class;
    }
}
