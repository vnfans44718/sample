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
		memberField.memberField1 = 1;
		memberField.memberField2 = 1.2;
		memberField.memberField3 = 'A';
		memberField.memberField4 = "이동현";
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println("MemberField객체의 4개멤버변수내용출력");
		System.out.println(memberField.memberField1);
		System.out.println(memberField.memberField2);
		System.out.println(memberField.memberField3);
		System.out.println(memberField.memberField4);
	}

}
