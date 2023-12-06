
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.변수선언
		 */
		int num1;
		String name;
		String num2;
		char gender;
		int num3;
		boolean smoking;
		double height;
		char grade;
		char face;
		/*
		 * 2.변수에 데이타(리터럴)대입
		 */
		num1 = 236514;
		name = "김미진";
		num2 = "970317-3495039";
		gender = '여';
		num3 = 0;
		smoking =  false;
		height = 162.5;
		grade = 'A';
		face = '중';
		/*
		 * 3.변수 데이타 출력
		 */
		System.out.println("*********************************");
		System.out.println("회원번호: "+num1);
		System.out.println("이    름: " +name);
		System.out.println("주민번호: "+num2);
		System.out.println("성    별: "+gender);
		System.out.println("결혼횟수: "+num3);
		System.out.println("흡연여부: "+smoking);
		System.out.println("키      : "+height);
		System.out.println("학    점: " +grade);
		System.out.println("용    모: "+face);
		System.out.println("*********************************");

	}

}
