package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		  ArrayList arrayList  = new ArrayList<>();
		  
		  arrayList.add(14);
		  arrayList.add(54);
		  arrayList.add(858);
		  arrayList.add(1);
		  arrayList.add(4);
		  
		  System.out.println(arrayList);
		  
		  
		  Collections.sort(arrayList);
		  System.out.println(arrayList);
		  
		 System.out.println(Collections.binarySearch(arrayList,14)); 
		 System.out.println(Collections.binarySearch(arrayList, 53));
		  Collections.reverse(arrayList);
			 System.out.println(arrayList);

		 
	}
}
