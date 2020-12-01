package com.cg.LabAssignment1_2_java_config;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	@Configuration
	public class AppConfig {
		
		   @Bean
		   public Employee employee(){
		      return new Employee(sbu());
		   }
		   @Bean
		   public SBU sbu() {
		      return new SBU();
		   }
		}


