package com.cg.LabAssignment1_1_xml_annotation;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;


	public class App 
	{
	    public static void main( String[] args )
	    {
	    	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
			Employee emp=(Employee)ctx.getBean("employee");
			System.out.println(emp);
	    }
	}
