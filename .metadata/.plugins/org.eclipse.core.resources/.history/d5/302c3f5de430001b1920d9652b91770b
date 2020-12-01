package Lab1_3;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  

public class EmployeeTest {

	public static void main(String[] args) {
		//FileSystemResource res=new FileSystemResource("beans.xml");  
        //BeanFactory factory=new XmlBeanFactory(res);     
        //SBU e=(SBU)factory.getBean("sbu");  
        //System.out.println(e.toString());
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		SBU s=(SBU)context.getBean("sbu");
		System.out.println(s.toString());
        
	}

}
