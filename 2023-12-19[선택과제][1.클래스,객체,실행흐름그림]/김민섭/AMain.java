package com.포함;

public class AMain {

//	2-1.AMain 클래스에 메인메쏘드 작성(생성)

	public static void main(String[] args) {

//		2-1-1.메인메쏘드에 코드작성
//	              - A객체생성		 
//	          - A객체멤버변수에 값대입
//		  - A객체멤버변수의 값출력

		A a1 = new A(3, 5); 

		a1.print(); 

		A a2 = new A(); 

		a2.substituting(7, 5); 

		a2.print(); 
	}

} 
