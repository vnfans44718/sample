package select;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField memf1 = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		memf1.memberField1 = 1;
		memf1.memberField2 = 2;
		memf1.memberField3 = 3;
		memf1.memberField4 = 4;
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(memf1.memberField1);
		System.out.println(memf1.memberField2);
		System.out.println(memf1.memberField3);
		System.out.println(memf1.memberField4);
	}

}