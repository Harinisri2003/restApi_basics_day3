package com.skcet.EmpDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.EmpDetails.model.Employee;
import com.skcet.EmpDetails.service.EmpService;


@RestController
@RequestMapping("/api/v1/controller")
public class EmpController {
	@Autowired
	 private EmpService empservice;
	
	
	@GetMapping("/getUser")
	public ResponseEntity<List<Employee>> getUser(){
		return ResponseEntity.status(200).body(empservice.getUser());
	} 
	
	 @PostMapping("/add")
     public ResponseEntity<String> addValue(@RequestBody Employee emp)
     {
    	boolean dataSaved=empservice.addValue(emp);
    	if(dataSaved)
    	{
    		return ResponseEntity.status(200).body("Added successfully");
    	}
    	else
    	{
    		return ResponseEntity.status(200).body("Not Added successfully");	
    	}
     }
}
