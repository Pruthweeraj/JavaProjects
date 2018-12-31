package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		
	Properties  properties = new Properties();
	
	FileInputStream fileInputStream = null;
	try {
			fileInputStream = new FileInputStream("C:\\Users\\pruthweerajp\\Desktop\\pr.txt");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	//loading the file to the properties object
	try {
		properties.load(fileInputStream);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//viewing the file
	System.out.println(properties);
	
	Enumeration<Object > enumeration = properties.elements();
	while(enumeration.hasMoreElements()){
		System.out.println(enumeration.nextElement());
	}
	
	
	String s = properties.getProperty("pr");
	System.out.println(properties.setProperty("pr", "1"));
	properties.setProperty("Jogi", "199");
	
	FileOutputStream fileOutputStream = null;
	try {
		fileOutputStream = new FileOutputStream("C:\\Users\\pruthweerajp\\Desktop\\pr.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		properties.store(fileOutputStream, "Edited By Pruthwee");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}
}
