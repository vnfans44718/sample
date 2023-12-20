package com.itwill05.Class;

public class BMain {

//	2-1.BMain 클래스에 메인메쏘드 작성(생성)
	public static void main(String[] args) {

//		2-1-1.메인메쏘드에 코드작성
		B nember = new B();

//		- B객체멤버변수2개(x,y)에 값대입
		nember.x =1234;
		nember.y =4567;

//		- B객체멤버변수2개의 값출력
	
		System.out.println("x");
		System.out.println("y");

//		- B객체멤버메쏘드2개호출(m1,m2)
	
		nember.m1(); 
		nember.m2(); 
	}
}

