package com.spring.ci;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(Certi certi) {
		super();
		this.certi = certi;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public Person(String name, int personid) {
		super();
		this.name = name;
		this.personid = personid;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [certi=" + certi + "]";
	}

	
}
