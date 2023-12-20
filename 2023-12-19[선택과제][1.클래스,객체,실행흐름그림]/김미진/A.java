package com.itwill00.기본;

public class A {
	// 1-1. A 클래스안에 멤버변수 2개선언(정의) 
	int x;
	int y;
}

class Amain {
	public static void main(String[] args) {
		/*
	2-1.AMain 클래스에 메인메쏘드 작성(생성)

	2-1-1.메인메쏘드에 코드작성
              - A객체생성		 
          - A객체멤버변수에 값대입
	  - A객체멤버변수의 값출력
		 */

		A a = new A();
		a.x = 3;
		a.y = 17;
		
		System.out.println(a.x);
		System.out.println(a.y);
		
	}
}