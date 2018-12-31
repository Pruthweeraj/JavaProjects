package com.collection;

import java.util.Comparator;

public class MyComoarator implements Comparator<Object> {

	@Override
	public int compare (Object obj1 , Object obj2){
		Integer integer = (Integer)obj1;
		Integer integer2 = (Integer)obj2;
		
		//for reverse storing //[2145, 85, 51, 15, 14, 11]
		if(integer<integer2){
			return +1;
			
		}
		else if(integer>integer2){
			return -1;
		}
		else 
		return 0;
	
	
	
		
		//return integer.compareTo(integer2);//[11, 14, 15, 51, 85, 2145]
	
	//	return integer2.compareTo(integer);//[2145, 85, 51, 15, 14, 11]
		
		//return -integer.compareTo(integer2);//[2145, 85, 51, 15, 14, 11]
		
	//	return -integer2.compareTo(integer);//[11, 14, 15, 51, 85, 2145]
		
		//return 1;//according to insertion order  //[15, 51, 2145, 14, 85, 11]
		
	//	return -1;//oposite to insertation order  //[11, 85, 14, 2145, 51, 15]

		
		
	}
}
