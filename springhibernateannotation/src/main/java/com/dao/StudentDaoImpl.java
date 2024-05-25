package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.Student;
@Component
public class StudentDaoImpl implements StudentDao{
	@Autowired	
	private SessionFactory sf;

	@Override
	public int insertStudent(Student s) {
		return (int) sf.getCurrentSession().save(s);
	}
}
