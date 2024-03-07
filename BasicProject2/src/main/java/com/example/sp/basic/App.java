package com.example.sp.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configBasic.xml");	
        Student student1 = (Student) context.getBean("studentFromBP20");
        Student student2 = (Student) context.getBean("studentFromBP21");
        Student student3 = (Student) context.getBean("studentFromBP22");
        System.out.println("Student1 : " + student1);
        System.out.println("Student2 : " + student2);
        System.out.println("Student3 : " + student3);
    }
}
