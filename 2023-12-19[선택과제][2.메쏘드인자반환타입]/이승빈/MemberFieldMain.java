package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField memberFieldMain = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		memberFieldMain.no = 1234;
		memberFieldMain.d = 12.34;
		memberFieldMain.chr = 'A';
		memberFieldMain.str = "안녕하세요";
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(memberFieldMain.no);
		System.out.println(memberFieldMain.d);
		System.out.println(memberFieldMain.chr);
		System.out.println(memberFieldMain.str);
		
	}

}
