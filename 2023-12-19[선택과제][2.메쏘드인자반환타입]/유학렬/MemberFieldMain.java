package com.itwill1199.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField m1 = new MemberField();
		MemberField m2 = new MemberField();
		MemberField m3 = new MemberField();
		MemberField m4 = new MemberField();

		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		m1.member1 = 1;
		m2.member2 = 2;
		m3.member3 = 3;
		m4.member4 = 4;

		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(m1.member1);
		System.out.println(m2.member2);
		System.out.println(m3.member3);
		System.out.println(m4.member4);
	}

}