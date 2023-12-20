package com.itwill99.review;

public class MemberMethodReturn {

	public int method1() {
		System.out.println("---public int method1()---");
		return 56;
	}

	public boolean method2() {
		System.out.println("---public boolean method2()---");
		return true;
	}

	public int add(int a, int b) {
		System.out.println("---public int add()---");
		return a+b;
	}
	
	public String hello(String c) {
		System.out.println("---public String Hello()---");
		return c+"님 안녕하세요";
	}
	
}
