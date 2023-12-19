package com.itwill99.review;

public class MemberMethod {
	public void method1() {
		System.out.println("public void method1() 실행");
	}

	public void method2() {
		System.out.println("public void method2() 실행");
	}

	public void method3(int method3) {
		System.out.println("method3 인자값 : " + method3);
	}

	public void method4(String s, int a, int b) {
		System.out.println("문자열 : " + s + "정수 : " + a + "," + b);
	}
	
	public void method5(String s1, String s2, int a, int b, int c) {
		System.out.println("문자열 : " + s1 + "," + s2 + "정수 : " + a + "," + b + "," + c);
	}

}
