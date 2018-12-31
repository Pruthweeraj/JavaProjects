package com.collection;

import java.util.Comparator;

public class MyEmployeeComparator implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {

		Employee emp1 = (Employee)obj1;
		Employee emp2 = (Employee)obj2;
		String e1 = emp1.getName();
		String e2 = emp2.getName();
		
		return e1.compareTo(e2);
	}

	

	

	
}
