package com.포함;

public class MemberMethodMain {

	public static void main(String[] args) {

		/*
		 * MemberMethod객체생성
		 */
		MemberMethod met1 = new MemberMethod();
		/*
		 * MemberMethodr객체 method1 호출
		 */
		met1.method1();
		/*
		 * MemberMethodr객체 method2 호출
		 */
		met1.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
		met1.method3(7);
		/*
		 * MemberMethodr객체 method4 호출
		 */
		met1.method4("행운의 숫자", 7);
		/*
		 * MemberMethodr객체 method5 호출
		 */
		met1.method5("불운의 ", "숫자", 4444);

	}

}
