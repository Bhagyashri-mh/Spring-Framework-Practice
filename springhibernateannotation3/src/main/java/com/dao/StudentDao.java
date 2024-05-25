
package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	int insertStudent(Student s);
	int deleteStudentBysid(int sid);
	Student findStudentBysid(int sid);
	List<Student> findAllStudent();
	int updateStudent(Student s);
	}
