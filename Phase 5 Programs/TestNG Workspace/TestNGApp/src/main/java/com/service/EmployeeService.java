package com.service;
import java.util.ArrayList;
import java.util.List;
import com.bean.Employee;

public class EmployeeService {

	public Employee getEmployeeDetails() {
		// we can call dao method. 
		Employee emp = new Employee(100,"Ravi",12000);
		return emp;
	}
	
	public List<Employee> listOfEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(100, "Raju", 14000));
		listOfEmp.add(new Employee(101, "Ravi", 16000));
		listOfEmp.add(new Employee(102, "Ramesh", 18000));
		// we call dao method and retrieve employee details from database. 
		return listOfEmp;
	}
	public float updateSalary(Employee emp) {
		// coding 
		emp.setSalary(emp.getSalary()+5000);
		return emp.getSalary();
	}
	
	public boolean checkUser(String userName,String password) {
		if(userName.equals("raj") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
}

