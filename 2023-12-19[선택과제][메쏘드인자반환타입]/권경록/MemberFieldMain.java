package com.itwill00.MemberFieldReturn;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		//MemberField m1 = new MemberField();
		MemberField m1 = new MemberField(3, 3.3, '가', "나다라");
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		//m1.memberField1=3;
		//m1.memberField2=3.3;
		//m1.memberField3='가';
		//m1.memberField4="나다라";
		
		
		
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		m1.print();
		/*
		 * System.out.println(m1.memberField1); 
		 * System.out.println(m1.memberField2);
		 * System.out.println(m1.memberField3); 
		 * System.out.println(m1.memberField4);
		 */
	}

}