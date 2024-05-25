package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.model.StudentRowMapper;
@Component
public class StudentDao {
	@Autowired
	private JdbcTemplate j;
	public int insertStudent(Student s)
	{
		String sql="insert into Student(sname,scity,spercentage) values(?,?,?)";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
	}
	
	public int deleteStudentBySid(int sid)
	{
		String sql= "delete from student where sid=?";
		return j.update(sql,sid);
 	}
	
	public Student findStudentBySid(int sid)
	{
		Student s= null;
		String sql="select sid,sname,scity,spercentage from Student where sid=?";
	
		List<Student> list =j.query(sql,new Object[] {sid},new StudentRowMapper());
		if(list.size()!=0)
			s= list.get(0);
		return s;
	}
	
	public List<Student> findAllStudent()
	{
		String sql= "select sid,sname,scity,spercentage from student";
		return j.query(sql, new StudentRowMapper());
	}
	
	public int updateStudent(Student s)
	{
		String sql="update Student set sname=?,scity=?,spercentage=? where sid=?";
		return j.update(sql, new Object[] {s.getSname(), s.getScity(),s.getSpercentage(), s.getSid()});
	}
}
