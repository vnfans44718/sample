package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField test = new MemberField();

		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		test.x = 3;
		test.y = 9;
		test.a = "감";
		test.b = "사";
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(test.x);
		System.out.println(test.y);
		System.out.println(test.a);
		System.out.println(test.b);
	}

}
