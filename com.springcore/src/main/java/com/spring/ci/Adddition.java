package com.spring.ci;

public class Adddition {
	private int a;
	private int b;
	
public Adddition(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("constructor: int,int" );
	
}
	public Adddition(double a,double b) {
	this.a =(int) a;
	this.b=(int) b;
	System.out.println("constructor:double double");
}
	public void dosum() {
		System.out.println("sum is = "+(this.a+this.b));
		
	}
	@Override
	public String toString() {
		return "Adddition [a=" + a + ", b=" + b + "]";
	}
	
}
