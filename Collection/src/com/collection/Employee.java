package com.collection;

public class Employee implements Comparable<Object> {

	

	private String name ;
	private int EId;
	
	//constructor using fields
	public Employee(String name, int EId) {
		super();
		this.name = name;
		this.EId = EId;
	}

	@Override
	public int compareTo(Object obj) {
		int Eid1 = this.EId;
		Employee Eid = (Employee)obj;
		int Eid2 = Eid.EId;
		/*if (Eid1 < Eid2){
			return -1;
		}
		else if (Eid1 > Eid2){
			return 1;
		}
		else return 0;*/
	
	
		Integer e1 = Eid1;
		Integer e2 = Eid2;
		 return 	e1.compareTo(e2);
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", EId=" + EId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEId() {
		return EId;
	}

	public void setEId(int eId) {
		EId = eId;
	}
	
	
	
}
