package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField memberField = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		memberField.MemberField1=100;
		memberField.MemberField2=100.00;
		memberField.MemberField3='A';
		memberField.MemberField4="안녕하세요";
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(memberField.MemberField1);
		System.out.println(memberField.MemberField2);
		System.out.println(memberField.MemberField3);
		System.out.println(memberField.MemberField4);
	}

}
