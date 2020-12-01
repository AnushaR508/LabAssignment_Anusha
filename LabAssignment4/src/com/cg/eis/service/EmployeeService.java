/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and runnimg interface EmployeeService
*/
package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
  public Employee getDetails();
  public String getScheme(double salary,String designation);
  public void DisplayDetails(Employee e);
}
