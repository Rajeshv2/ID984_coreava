package com.createiq.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMP009 VALUES(?,?)", new Object[] { employee.getEid(), employee.getEname() });

	}

	@Override
	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMP009 SET ENAME = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEid() });

	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("select*from emp009 ", new BeanPropertyRowMapper(Employee.class));

	}

	@Override
	public Employee findById(Integer eid) {

		return jdbcTemplate.queryForObject("select*from emp009 where eid=?",new Object[] {eid},new int[] {Types.INTEGER});
	}

	@Override
	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMP009 WHERE EID = ?", new Object[] { eid });
	}

}