package 클래스_객체_실행흐름그림;

public class BMain {

	public static void main(String[] args) {

		B abc = new B();

		abc.x = 1;
		abc.y = 2;
		System.out.println(abc.x);
		System.out.println(abc.y);

		abc.m1();
		abc.m2();

	}

}
