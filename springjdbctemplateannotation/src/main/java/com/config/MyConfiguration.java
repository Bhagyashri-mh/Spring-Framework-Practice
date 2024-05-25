package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.dao"} )
public class MyConfiguration {
		@Bean
		public JdbcTemplate j1()
		{
			JdbcTemplate j= new JdbcTemplate();
			j.setDataSource(d1());
			return j;
		}
		
		private DriverManagerDataSource d1()
		{
			DriverManagerDataSource ds= new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/jap55spring");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
		}
}
