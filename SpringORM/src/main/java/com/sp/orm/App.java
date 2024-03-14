package com.sp.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.orm.dao.StudentDao;
import com.sp.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/orm/config.xml");
    	StudentDao sd = (StudentDao) context.getBean("ormObject");
    	Student st = new Student("Shiwali", 376, "Mirzapur");
    	int res = sd.insert(st);
        System.out.println( "Hello World!---- " + res );
    }
}
