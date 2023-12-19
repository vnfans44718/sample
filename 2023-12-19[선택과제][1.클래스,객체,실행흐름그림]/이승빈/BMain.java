package com.itwill99.review;

// 2.BMain 이라는 이름의 클래스작성
public class BMain {

/*
2-1.BMain 클래스에 메인메쏘드 작성(생성)
	2-1-1.메인메쏘드에 코드작성
	  - B객체생성
	  - B객체멤버변수2개(x,y)에 값대입
	  - B객체멤버변수2개의 값출력
	  - B객체멤버메쏘드2개호출(m1,m2)
*/
	public static void main(String[] args) {
		
		B test = new B();
		
		test.x = 1234;
		test.y = "메쏘드정의";
		
		System.out.println(test.x);
		System.out.println(test.y);
		
		test.m1();
		test.m2();

	}

}
