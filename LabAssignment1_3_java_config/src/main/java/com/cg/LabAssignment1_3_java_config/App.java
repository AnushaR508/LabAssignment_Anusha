package com.cg.LabAssignment1_3_java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
	{
	    public static void main( String[] args )
	    {
	    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);    
	        SBU sbu=(SBU)ctx.getBean(SBU.class);
	        System.out.println(sbu);
	    }
	}

