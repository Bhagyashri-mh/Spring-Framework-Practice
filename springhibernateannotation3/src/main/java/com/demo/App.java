package com.demo;

import java.util.Random;

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
       Student s= ss.findStudentBysid(1455);
       s.setSname("Rani");
       s.setScity("Jaipur");
       System.out.println(ss.updateStudent(s));
    }
}
