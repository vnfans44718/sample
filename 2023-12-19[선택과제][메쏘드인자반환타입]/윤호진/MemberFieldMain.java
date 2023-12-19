package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField m1 = new MemberField();		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
			m1.no=01;
			m1.name="윤호진";
			m1.sum = 30;
			m1.avg = (double)10.5;
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
			System.out.println(m1.no);
			System.out.println(m1.name);
			System.out.println(m1.sum);
			System.out.println(m1.avg);
			
	}

}
