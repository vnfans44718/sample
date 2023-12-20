package 메쏘드인자반환타입;

public class MemberMethodMain {

	public static void main(String[] args) {

		/*
		 * MemberMethod객체생성
		 */
		MemberMethod mm = new MemberMethod();
		/*
		 * MemberMethodr객체 method1 호출
		 */
		mm.method1();

		/*
		 * MemberMethodr객체 method2 호출
		 */
		mm.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
		mm.method3(1);
		/*
		 * MemberMethodr객체 method4 호출
		 */
		mm.method4("가나", 2);
		/*
		 * MemberMethodr객체 method5 호출
		 */
		mm.method5("가나", "거너", 3);

	}

}