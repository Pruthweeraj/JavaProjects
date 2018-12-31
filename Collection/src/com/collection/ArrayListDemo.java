package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList<>();
		
												
		ArrayList arrayList2 = new ArrayList<>(15);//With initial capacity
		
		List<String> list = new ArrayList<>();
		list.add("pruthwee");
		list.add("Jogi");
		list.add("Akash");
		list.add("puja");
		list.add("Sri");
		list.add("mathana");
		
		//ArrayList arrayList = new Arraylist(Collection c);
		ArrayList arrayList3 = new ArrayList<>(list);
		
		
		System.out.println(arrayList.size());
		System.out.println(arrayList2.size());
		System.out.println(arrayList3.size());
		System.out.println(arrayList);
		System.out.println(arrayList2);
		System.out.println(arrayList3);
	}
}
