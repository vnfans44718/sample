package com.itwill99.review;

public class MemberMethod {
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method1
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 없음 
	 *   - 구현내용  : System.out.println("public void method1()실행");
	 */
	public void method1() {
		System.out.println("public void method1()실행");
	}
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method2
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 없음 
	 *   - 구현내용  : System.out.println("public void method2()실행");   
	 */
	public void method2() {
		System.out.println("public void method2()실행");
	}
	
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method3
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 정수(1개) 
	 *   - 구현내용  : 인자로받은데이타 1개출력 
	 */
	public void method3(int a) {
		System.out.println("int a : " + a);
	}
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method4
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 문자열,정수(2개) 
	 	 - 구현내용  : 인자로받은데이타 2개출력 
	 */
	public void method4(String a, int b) {
		System.out.println("String a : " + a);
		System.out.println("int b : " + b);
	}
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method5
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 문자열,문자열,정수(3개) 
	 *   - 구현내용  : 인자로받은데이타 3개출력 
	 */
	public void method5(String a, String b, int c) {
		System.out.println("String a : " + a);
		System.out.println("String b : " + b);
		System.out.println("int c : " + c);
	}
	
}
