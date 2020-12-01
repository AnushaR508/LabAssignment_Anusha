package Lab1_3;

public class Employee {
	 private int employeeId;
     private String EmployeeName;
     private double Salary;
     private int age;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary
				+ ", age=" + age + "]";
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int employeeId, String employeeName, double salary, int age) {
		super();
		this.employeeId = employeeId;
		EmployeeName = employeeName;
		Salary = salary;
		
		this.age = age;
	}
	public Employee() {
		super();
	}
     
}
