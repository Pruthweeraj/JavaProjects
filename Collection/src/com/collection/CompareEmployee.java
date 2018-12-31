package com.collection;

import java.util.TreeSet;

public class CompareEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Pruthwee", 101);
		Employee employee2 = new Employee("Jogi", 105);
		Employee employee3 = new Employee("Pooja", 102);
		Employee employee4 = new Employee("Akash", 104);
		Employee employee5 = new Employee("Sri", 103);
		Employee employee6 = new Employee("Mathana", 106);
		
		TreeSet<Employee> treeSet = new TreeSet<>();
		treeSet.add(employee);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee3);
		treeSet.add(employee4);
		treeSet.add(employee5);
		treeSet.add(employee6);
		
		System.out.println(treeSet);
		
		TreeSet<Employee> treeSet2 = new TreeSet<>( new MyEmployeeComparator());
		treeSet2.add(employee);
		treeSet2.add(employee2);
		treeSet2.add(employee3);
		treeSet2.add(employee3);
		treeSet2.add(employee4);
		treeSet2.add(employee5);
		treeSet2.add(employee6);
		
		System.out.println(treeSet2);
		
		
	}
}
