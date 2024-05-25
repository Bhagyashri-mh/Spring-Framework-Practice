package com.config;

import java.util.Properties;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.dao", "com.service"})
public class MyConfiguration {
	@Bean
	public LocalSessionFactoryBean l1()
	{
		LocalSessionFactoryBean l= new LocalSessionFactoryBean();
		l.setDataSource(d1());
		l.setHibernateProperties(p1());
		l.setPackagesToScan("com.model");
		return l;
	}
	
	private DriverManagerDataSource d1() {
		DriverManagerDataSource d= new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/jap55spring");
		d.setUsername("root");
		d.setPassword("root");
		return d;
	}
	
	private Properties p1()
	{
		Properties p= new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		return p;
	}
	@Bean
	public HibernateTransactionManager h1()
	{
		return new HibernateTransactionManager(l1().getObject());
	}
}
