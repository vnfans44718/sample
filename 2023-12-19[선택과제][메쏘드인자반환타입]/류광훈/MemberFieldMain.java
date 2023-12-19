package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf1;
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf1 = new MemberField();
		mf1.memberField1 = 1;
		mf1.memberField2 = 2.5;
		mf1.memberField3 = true;
		mf1.memberField4 = "문자열";
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.printf("MemberField객체의 4개멤버변수내용출력 : ");
		System.out.println(mf1.memberField1 + " " + 
							mf1.memberField2 + " " + 
							mf1.memberField3 + " " + 
							mf1.memberField4);
	}

}