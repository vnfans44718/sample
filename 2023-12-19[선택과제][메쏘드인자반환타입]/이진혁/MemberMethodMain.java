package SelectHomework;

public class MemberMethodMain {

	public static void main(String[] args) {
		
		/*
		 * MemberMethod객체생성
		 */
			MemberMethod memberMethod = new MemberMethod();
		/*
		 * MemberMethodr객체 method1 호출
		 */
			memberMethod.method1();
		/*
		 * MemberMethodr객체 method2 호출
		 */
			memberMethod.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
			memberMethod.method3(7);
		/*
		 * MemberMethodr객체 method4 호출
		 */
			memberMethod.method4("손흥민", 7);
		/*
		 * MemberMethodr객체 method5 호출
		 */
			memberMethod.method5("손흥민", "backNo", 7);
		
	}

}