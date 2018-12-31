package com.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (int)obj1;
		Integer i2 = (int)obj2;
		
		return i2.compareTo(i1);
	}

	
}
