package com.example.demo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User1Test {
    @Test
    public void main(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");

        User1 user1=(User1) ac.getBean("user1");

        System.out.println(user1);
    }

}