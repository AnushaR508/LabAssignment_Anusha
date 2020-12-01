/**  Author name : ANUSHA R
     date: 02/11/2020
     desc: testing compilation and running Exception handler function for invalid salary exception
*/

package com.cg.eis.exception;

public class EmployeeException {

	public void checkSalary(double salary) throws InvalidSalaryException {

		if (salary < 3000) // whether salary is less than 3000
			throw new InvalidSalaryException("Salary of an employee is below 3000 ");
		else
			System.out.println("Salary of an employee is :" + salary);
	}

}
