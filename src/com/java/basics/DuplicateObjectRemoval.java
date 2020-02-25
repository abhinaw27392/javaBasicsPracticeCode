package com.java.basics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateObjectRemoval {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1111, "Abhinaw");
		Employee emp3 = new Employee(2222, "Tarun");
		Employee emp4 = new Employee(3333, "Saurabh");
		Employee emp2 = new Employee(1111, "Abhinaw");
		Employee emp5 = new Employee(4444, "Rahul");
		Employee emp6 = new Employee(4444, "Rahul");

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		System.out.println("Original list: " + list);
		System.out.println("After duplicate Removal List is: " + removeDuplicateEmployee(list));

	}

	public static ArrayList<Employee> removeDuplicateEmployee(ArrayList<Employee> list) {
		Set<Employee> set = new LinkedHashSet<Employee>();
		set.addAll(list);
		ArrayList<Employee> listNew = new ArrayList<Employee>();
		listNew.addAll(set);
		return listNew;
	}

}

class Employee {
	int empId;
	String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public String toString() {
		return "EmpId: " + this.empId + " EmpName: " + this.empName;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		if (empId != emp.empId)
			return false;
		return true;

	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.empId;
		result = prime * result + (this.empName == null ? 0 : this.empName.hashCode());
		return result;
	}
}
