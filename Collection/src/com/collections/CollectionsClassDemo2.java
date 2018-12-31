package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClassDemo2 {

	public static void main(String[] args) {
		  ArrayList arrayList  = new ArrayList<>();
		  
		  arrayList.add(14);
		  arrayList.add(54);
		  arrayList.add(858);
		  arrayList.add(1);
		  arrayList.add(4);
		  
		  System.out.println(arrayList);
		  
		  
		  Collections.sort(arrayList,new MyComparator());
		  System.out.println(arrayList);
		  System.out.println(Collections.binarySearch(arrayList,14,new MyComparator())); 
			 System.out.println(Collections.binarySearch(arrayList, 53, new MyComparator()));

			Comparator c1 = Collections.reverseOrder(new MyComparator());
		  System.out.println(c1);
		  
		 System.out.println(Collections.binarySearch(arrayList,14,c1)); 
		 System.out.println(Collections.binarySearch(arrayList, 53, new MyComparator()));

		 
	}
}
