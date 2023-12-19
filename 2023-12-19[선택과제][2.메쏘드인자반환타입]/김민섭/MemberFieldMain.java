package com.포함;

public class MemberFieldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.MemberField객체생성
		 */

		MemberField m1 = new MemberField();

		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */

		m1.b = true;
		m1.c = '힣';
		m1.d = 3.14;
		m1.i = 7;

		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */

		System.out.println(m1.b);
		System.out.println(m1.c);
		System.out.println(m1.d);
		System.out.println(m1.i);
	}

}
