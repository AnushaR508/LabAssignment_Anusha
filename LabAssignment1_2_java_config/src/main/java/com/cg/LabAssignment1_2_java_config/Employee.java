package com.cg.LabAssignment1_2_java_config;

public class Employee {
		private int employeeId;
		private String employeeName;
		private double salary;
		private SBU businessUnit;
		
		
		
		public Employee(SBU businessUnit) {
			this.businessUnit = businessUnit;
		}
		
		
		public int getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
					+ "\nsbu details=" + businessUnit +"]";
		}


		public SBU getBusinessUnit() {
			return businessUnit;
		}


		public void setBusinessUnit(SBU businessUnit) {
			this.businessUnit = businessUnit;
		}
		
		

	}

