package com.skcet.EmpDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.EmpDetails.model.Employee;


public interface EmpRepository extends JpaRepository<Employee, Integer>{
	 public boolean existsById(int id);

}
