package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private SessionFactory sf;

	@Override
	public int insertStudent(Student s) {
		return (int) sf.getCurrentSession().save(s);
	}

	@Override
	public int deleteStudentBysid(int sid) {
		return sf.getCurrentSession().createQuery("delete from Student where sid=:a")
				.setParameter("a",sid)
				.executeUpdate();
	}

	@Override
	public Student findStudentBysid(int sid) {
		return sf.getCurrentSession().get(Student.class,sid);	
		}

	@Override
	public List<Student> findAllStudent() {
		return sf.getCurrentSession().createCriteria(Student.class).list();
	}

	@Override
	public int updateStudent(Student s) {
		return sf.getCurrentSession().createQuery("update Student set sname=:a,scity=:b,spercentage=:c where sid=:d")
				.setParameter("a", s.getSname())
				.setParameter("b", s.getScity())
				.setParameter("c", s.getSpercentage())
				.setParameter("d", s.getSid())
				.executeUpdate();
	}
}
