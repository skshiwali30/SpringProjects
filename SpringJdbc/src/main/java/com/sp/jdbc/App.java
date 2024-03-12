package com.sp.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sp.jdbc.dao.StudentDao;
import com.sp.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "JDBC Connection started" );
        int result = 0;
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/jdbc/configJdbc.xml");
        StudentDao template = context.getBean("ins", StudentDao.class);
        Student st = new Student();
		/*
		 * Inserting records into db
		 * st.setId(978); st.setName("Anshu Kumar"); st.setCity("Bhagalpur");
		 * result = template.insertData(st);
		 */
        
		 //Updating records into db 
			/*
			 * Scanner sc = new Scanner(System.in);
			 * System.out.println("Enter the userId you want to update.. ");
			 * st.setCity("Gorakhpur"); st.setName("Reema"); st.setId(sc.nextInt()); result
			 * = template.changeData(st);
			 */
        
		/*
		 * delete record in db 
		 * result = template.deleteData(st);
		 */
        
        Student st1 = template.getStudent(978);
        System.out.println(st1);
        
        // Fetch all records
        List<Student> stAll = template.getAllStudents();
        System.out.println(stAll);
        
        //System.out.println("Number of rows affected .. " + result);
    }
}
