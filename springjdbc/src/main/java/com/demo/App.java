package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
       StudentDao sd= context.getBean(StudentDao.class);
       
      
       System.out.println(sd.deleteStudentSid(3));
    }
}
