package com.skcet.EmpDetails.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.EmpDetails.model.Employee;
import com.skcet.EmpDetails.service.EmpService;


@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
	private EmpRepository emprepository;
    
    
	@Override
	public boolean addValue(Employee emp) {
		// TODO Auto-generated method stub
		boolean isIdExist=emprepository.existsById(emp.getId());
		if(!isIdExist)
		{
			emprepository.save(emp);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public List<Employee> getUser() {
		return emprepository.findAll();
	}
	
    
}
