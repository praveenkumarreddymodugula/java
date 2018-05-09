package com.test.learning;

public class EmployeeDemo {
        
 int empId;
 String empName;
 double salary;
public EmployeeDemo(int empId,String empName,double empSalary){

	this.empId = empId;
	this.empName = empName;
	salary = empSalary;		

	}

}
class Application {
	public static void main(String[] args){
    EmployeeDemo e = new EmployeeDemo(1,"praveen",80000);
		System.out.println("employee is : " +e.empId);
		System.out.println("employeeName is : " +e.empName);
		System.out.println("employeeSalary is : " +e.salary);
	}
	
	
}