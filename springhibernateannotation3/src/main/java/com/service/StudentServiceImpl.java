package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
		@Autowired
		private StudentDao sd;

		@Override
		public int insertStudent(Student s) {
			return sd.insertStudent(s);
		}

		@Override
		public int deleteStudentBysid(int sid) {
			return sd.deleteStudentBysid(sid);
		}

		@Override
		public Student findStudentBysid(int sid) {
			return sd.findStudentBysid(sid);
		}

		@Override
		public List<Student> findAllStudent() {
			return sd.findAllStudent();
		}

		@Override
		public int updateStudent(Student s) {
			return sd.updateStudent(s);
		}
}
