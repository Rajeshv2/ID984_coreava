package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {
	 void add(Employee employee);

	 void update(Employee employee);

	void deleteById(Integer eid);

	Employee findById(Integer eid);

	 public List<Employee> findAll();
}
