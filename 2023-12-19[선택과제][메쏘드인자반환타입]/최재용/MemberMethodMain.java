package select;

public class MemberMethodMain {

	public static void main(String[] args) {
		
		/*
		 * MemberMethod객체생성
		 */
		MemberMethod memm = new MemberMethod();
		/*
		 * MemberMethodr객체 method1 호출
		 */
		memm.method1();
		/*
		 * MemberMethodr객체 method2 호출
		 */
		memm.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
		memm.method3(1);
		/*
		 * MemberMethodr객체 method4 호출
		 */
		memm.method4(1, 2, "CHOI");
		/*
		 * MemberMethodr객체 method5 호출
		 */
		memm.method5(1, 2, 3, "CHOI", "KIM");
		
		
		
	}

}