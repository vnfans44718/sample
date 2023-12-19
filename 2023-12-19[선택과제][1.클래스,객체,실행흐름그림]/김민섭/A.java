package com.포함;

public class A {

//	1-1. A 클래스안에 멤버변수 2개선언(정의) 
	int x;
	int y;

	public A() { 
	}

	public A(int x, int y) { 
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
}
