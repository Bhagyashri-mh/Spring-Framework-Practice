package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired	
	private EmployeeDao ed;

	
	public int insertEmployee(Employee e) {
		return ed.insertEmployee(e);
	}
}
