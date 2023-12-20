

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		
		MemberField member = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		
		member.a= 1234;
		member.b= 5678;
		member.chr= 'A';
		member.str= "Hello";
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		
		System.out.println(member.a);
		System.out.println(member.b);
		System.out.println(member.chr);
		System.out.println(member.str);
	}

}