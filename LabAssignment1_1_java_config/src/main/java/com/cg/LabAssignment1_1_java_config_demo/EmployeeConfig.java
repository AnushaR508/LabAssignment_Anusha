package com.cg.LabAssignment1_1_java_config_demo;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;


		
		@Configuration
		public class EmployeeConfig {
		   @Bean 
		   public Employee employee(){
		      return new Employee();
		   }
		}



