package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new AnnotationConfigApplicationContext(MyConfiguration.class);
      StudentDao sd= context.getBean(StudentDao.class);
      
     // Student s= sd.findStudentBySid(9);
      //System.out.println(s);
      
  //    List<Student> list =sd.findAllStudent();
    //  for(Student s:list)
    	//  System.out.println(s);
      
      Student s= sd.findStudentBySid(2);
      s.setScity("Delhi");
      s.setSname("Ram");
      System.out.println(sd.updateStudent(s));
      
    }
}
