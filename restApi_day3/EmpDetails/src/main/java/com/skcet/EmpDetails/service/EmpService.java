package com.skcet.EmpDetails.service;

import java.util.List;

import com.skcet.EmpDetails.model.Employee;

public interface EmpService {

	public boolean addValue(Employee emp);
	public List<Employee> getUser();
}
