package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		
		MemberField mbf=new MemberField();
		
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mbf.member1=1;
		mbf.member2=2;
		mbf.member3=3;
		mbf.member4=4;
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(mbf.member1);
		System.out.println(mbf.member2);
		System.out.println(mbf.member3);
		System.out.println(mbf.member4);
	}

}