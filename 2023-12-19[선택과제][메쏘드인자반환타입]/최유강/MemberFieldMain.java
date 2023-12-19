package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf1 = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf1.MemberField1 = 1;
		mf1.MemberField2 = true;
		mf1.MemberField3 = 1.0;
		mf1.MemberField4 = 'a';
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		
		System.out.println(mf1.MemberField1);
		System.out.println(mf1.MemberField2);
		System.out.println(mf1.MemberField3);
		System.out.println(mf1.MemberField4);
	}

}