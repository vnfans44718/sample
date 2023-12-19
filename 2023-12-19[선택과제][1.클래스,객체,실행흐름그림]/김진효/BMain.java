package itwill.notDefine;

//  2.BMain 이라는 이름의 클래스작성
public class BMain {
// 2-1.BMain 클래스에 메인메쏘드 작성(생성)
	public static void main(String[] args) {

		// B객체생성
		B objectB = new B();

		// B객체멤버변수2개(x,y)에 값대입
		objectB.x = 123;
		objectB.y = 456;

		// B객체멤버변수2개의 값출력
		System.out.println(">> B객체의 멤버변수를 출력해보자!");
		System.out.println(objectB.x);
		System.out.println(objectB.y);

		// B객체멤버메쏘드2개호출(m1,m2)
		objectB.m1();
		objectB.m2();
	}
}
