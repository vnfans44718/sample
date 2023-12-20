package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf.mf1 = "내 이름은";
		mf.mf2 = "김미진";
		mf.mf3 = "내 나이는";
		mf.mf4 = 27;
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(mf.mf1 + "\t" + mf.mf2 + "\n" + mf.mf3 + "\t" + mf.mf4);
	}

}