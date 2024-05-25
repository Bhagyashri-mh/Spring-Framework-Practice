package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;
import com.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
       StudentService ss= context.getBean(StudentService.class);
       Student s= new Student();
       s.setSname("Sharayu Mankar");
       s.setScity("Amravati");
       s.setSpercentage(98.20);
       System.out.println(ss.insertStudent(s));
    }
}
