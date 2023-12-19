package itwill.notDefine;

// 2. AMain이라는 이름의 클래스작성
public class AMain {
	// 2-1. AMain 클래스에 메인메쏘드 작성(생성)
	public static void main(String[] args) {
		/* 2-1-1.메인메쏘드에 코드작성
		  - A객체생성		 
		  - A객체멤버변수에 값대입
		  - A객체멤버변수의 값출력
		*/

		A objectA = new A();
		objectA.myNameIsA = 123;
		objectA.myNameIsA2 = 456;

		System.out.println(" >> A객체 멤버 변수의 값을 출력해보자!");
		System.out.println(objectA.myNameIsA);
		System.out.println(objectA.myNameIsA2);
	}
}
