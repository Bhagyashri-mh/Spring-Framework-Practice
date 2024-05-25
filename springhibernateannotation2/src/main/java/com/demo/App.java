package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.Employee;
import com.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        EmployeeService es= context.getBean(EmployeeService.class);
        Employee e= new Employee();
        e.setEname("siya rao");
        e.setEdesignation("Project Manager");
        e.setEcompany("TCS");
        e.setEsalary(30000);
        System.out.println(es.insertEmployee(e));
    }
}
