package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/cons.xml");
        if(con.containsBean("stu")) {
            Student st1 = (Student) con.getBean("stu");
            System.out.println(st1);
        }
        if(con.containsBean("stud")) {
            Student st = (Student) con.getBean("stud");
            System.out.println(st);
        }
    }
}