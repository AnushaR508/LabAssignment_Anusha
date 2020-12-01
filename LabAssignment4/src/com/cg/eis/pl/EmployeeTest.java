/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and running Employee main class
*/

package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeImplementation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj=new Employee();
		EmployeeImplementation ei=new EmployeeImplementation();
		obj=ei.getDetails();
		String insurance_scheme=ei.getScheme(obj.getSalary(),obj.getDesignation());
		obj.setInsuranceScheme(insurance_scheme);
		ei.DisplayDetails(obj);
	}

}