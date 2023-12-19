package com.itwill99.review;

public class MemberMethodMain {

	public static void main(String[] args) {
		/*
		 * MemberMethod객체생성
		 */
		MemberMethod memberMethod = new MemberMethod();
		
		/*
		 * MemberMethodr객체 method1 호출
		 */
		memberMethod.method1();
		
		/*
		 * MemberMethodr객체 method2 호출
		 */
		memberMethod.method2();
		
		/*
		 * MemberMethod객체 method3 호출
		 */
		memberMethod.method3(9);
		
		/*
		 * MemberMethodr객체 method4 호출
		 */
		memberMethod.method4("다나카", 30);
		
		/*
		 * MemberMethodr객체 method5 호출
		 */
		memberMethod.method5("알파카", "낙타", 27);
	
	}
}