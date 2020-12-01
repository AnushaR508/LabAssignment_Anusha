package Lab1_4;

import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

import Lab1_3.SBU;  
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//FileSystemResource res=new FileSystemResource("beans.xml");  
        //BeanFactory factory=new XmlBeanFactory(res);     
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		SBU1 s=(SBU1)context.getBean("sbu");
      //  SBU e=(SBU)factory.getBean("sbu"); 
        System.out.println("Employee id: ");
        int id=sc.nextInt();
        List<Employee> employee=s.getEmplist();
        for(Employee i:employee) {
        	if(i.getEmployeeId()==id)
        		System.out.println("Employee Info---------\n"+i);
        }
        
	}

}
