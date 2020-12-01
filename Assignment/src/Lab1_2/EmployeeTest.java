package Lab1_2;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class EmployeeTest {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("beans.xml");  
        BeanFactory factory=new XmlBeanFactory(res);     
        Employee e=(Employee)factory.getBean("emp");  
        System.out.println(e.toString());
        
	}

}
