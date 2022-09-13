package com.createiq.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	@Autowired
	public EmployeeService employeeService;

	@GetMapping("/findAll")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/findById/{eid}")
	public Employee findById(@PathParam("eid") Integer eid) {
		return employeeService.findById(eid);
	}

//	@RequestMapping(value = "/xml/allEmp", produces = "application/xml")
//	public List<Employee> findAllRs() {
//		return employeeService.findAll();
//	}
//	
//	@RequestMapping(value = "json/allEmp",produces = "application/xml")
//	public List<Employee> findAllRsJson(){
//		return employeeService.findAll();
//	}
}
