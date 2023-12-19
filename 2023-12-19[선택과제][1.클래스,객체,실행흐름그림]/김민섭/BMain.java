package com.포함;

public class BMain {

//		2-1.BMain 클래스에 메인메쏘드 작성(생성)
	public static void main(String[] args) { 

//		2-1-1.메인메쏘드에 코드작성
//		  - B객체생성
//		  - B객체멤버변수2개(x,y)에 값대입
//		  - B객체멤버변수2개의 값출력
//		  - B객체멤버메쏘드2개호출(m1,m2)

		B b1 = new B(9, 9); 
		b1.print();
		b1.m1();
		b1.m2(); 

	}

} 
