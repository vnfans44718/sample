package 메쏘드인자반환타입;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf = new MemberField();

		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf.a = 1;
		mf.b = 2;
		mf.c = 3;
		mf.d = 4;

		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(mf.a);
		System.out.println(mf.b);
		System.out.println(mf.c);
		System.out.println(mf.d);
	}

}