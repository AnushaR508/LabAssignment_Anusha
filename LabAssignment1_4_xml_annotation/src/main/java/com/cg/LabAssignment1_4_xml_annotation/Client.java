package com.cg.LabAssignment1_4_xml_annotation;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Client 
	{
		
	  
	  @Autowired
	  private  List<Employee> emp;
	    
		
		public List<Employee> getEmp() {
		return emp;
	}


}