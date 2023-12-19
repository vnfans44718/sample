package SelectHomework;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
			MemberField memberField = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
			memberField.backNo = 7;
			memberField.height = 184;
			memberField.weight = 78.4;
			memberField.name = "손흥민";
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
			System.out.println(memberField.backNo);
			System.out.println(memberField.height);
			System.out.println(memberField.weight);
			System.out.println(memberField.name);
	}

}