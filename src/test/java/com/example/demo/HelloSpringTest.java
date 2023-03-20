package com.example.demo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {
    @Test

    public  void main(){
        //获取Spring容器

        ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");


        //从Spring容器获取对象
        HelloSpring helloSpring=(HelloSpring)ac.getBean("helloSpring");

        //调用对象的方法
        helloSpring.show();
    }
}