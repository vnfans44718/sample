package itwill1199.review;

public class MemberMethodMain {

	public static void main(String[] args) {

		/*
		 * MemberMethod객체생성
		 */
		MemberMethod memberObject = new MemberMethod();

		/*
		 * MemberMethodr객체 method1 호출
		 */
		memberObject.method1();

		/*
		 * MemberMethodr객체 method2 호출
		 */
		memberObject.method2();

		/*
		 * MemberMethod객체 method3 호출
		 */
		memberObject.method3(3);

		/*
		 * MemberMethodr객체 method4 호출
		 */
		memberObject.method4("I'm method4", 4);

		/*
		 * MemberMethodr객체 method5 호출
		 */
		memberObject.method5("메소드 5를 호출하셨나요..?", "바로 뒤에 정수타입의 매개변수도 호출한 곳으로 보내드릴게요 짠  →", 4);

	}

}