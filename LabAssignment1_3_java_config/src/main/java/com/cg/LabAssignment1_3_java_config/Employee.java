package com.cg.LabAssignment1_3_java_config;

	import org.springframework.stereotype.Component;

	@Component("employee")
	public class Employee {
		private int employeeId;
		private String employeeName;
		private double salary;
		private int age;
		
		
		public Employee() {
			super();
		}
		
	   	

		public Employee(int employeeId, String employeeName, double salary, int age) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = salary;
			this.age = age;
		}
}
