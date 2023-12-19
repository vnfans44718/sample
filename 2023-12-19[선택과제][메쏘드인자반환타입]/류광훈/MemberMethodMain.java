package com.itwill99.review;

public class MemberMethodMain {

	public static void main(String[] args) {
		
		/*
		 * MemberMethod객체생성
		 */
		MemberMethod mf1 = new MemberMethod();
		/*
		 * MemberMethodr객체 method1 호출
		 */
		mf1.method1();
		/*
		 * MemberMethodr객체 method2 호출
		 */
		mf1.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
		mf1.method3(1);
		/*
		 * MemberMethodr객체 method4 호출
		 */
		mf1.method4("문자열", 2);
		/*
		 * MemberMethodr객체 method5 호출
		 */
		mf1.method5("문자열2", "문자열3",  3);
		
		
		
	}

}