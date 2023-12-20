package com.itwill1199.review;

public class MemberMethodMain {

	public static void main(String[] args) {

		/*
		 * MemberMethod객체생성
		 */
		MemberMethod m1 = new MemberMethod();

		/*
		 * MemberMethodr객체 method1 호출
		 */
		m1.method1();

		/*
		 * MemberMethodr객체 method2 호출
		 */
		m1.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
		m1.method3(1);
		/*
		 * MemberMethodr객체 method4 호출
		 */
		m1.method4("method4", 4);
		/*
		 * MemberMethodr객체 method5 호출
		 */
		m1.method5("method5", "method5-1", 5);

	}

}