package com.포함;

public class B {

//	1-1. B 클래스안에 멤버변수 2개선언(정의): 이름 x,y 

	int x, y;

//	 1-2. B 클래스안에 멤버메쏘드 m1,m2 2개선언(정의)
//	    	- 멤버메쏘드내용은 
//	        	System.out.println("m1호출");	 
//	        	System.out.println("m2호출");	

	public B() {
		// TODO Auto-generated constructor stub
	}

	public B(int x, int y) { 
		this.x = x; 
		this.y = y; 
	}

	public void substituting(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() { 
		System.out.println(x + "," + y);
	} 

	public void m1() {
		System.out.println("m1호출");
	} 

	public void m2() {
		System.out.println("m2호출");
	} 

}
