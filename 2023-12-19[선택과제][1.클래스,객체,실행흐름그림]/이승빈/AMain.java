package com.itwill99.review;

// 2.AMain 이라는 이름의 클래스작성
public class AMain {

// 2-1.AMain 클래스에 메인메쏘드 작성(생성)
	public static void main(String[] args) {

/*
2-1-1.메인메쏘드에 코드작성
       - A객체생성		 
       - A객체멤버변수에 값대입
       - A객체멤버변수의 값출력
 */
	A test = new A();
	
	test.a = 5;
	test.b = "LEE";
	
	System.out.println(test.a);
	System.out.println(test.b);
		
	}

}
