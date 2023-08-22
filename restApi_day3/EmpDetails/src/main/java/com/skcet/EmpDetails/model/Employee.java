package com.skcet.EmpDetails.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
        private String empName;
        private int empAge;
        private long salary;
        
		public Employee() {
			super();
		}
		public Employee(int id, String empName, int empAge, long salary) {
			super();
			this.id = id;
			this.empName = empName;
			this.empAge = empAge;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
        
}
