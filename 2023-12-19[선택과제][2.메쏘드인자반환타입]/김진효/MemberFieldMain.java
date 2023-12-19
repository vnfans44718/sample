package itwill1199.review;

public class MemberFieldMain {

	public static void main(String[] args) {

		// 1.MemberField객체생성
		MemberField mfObject = new MemberField();

		// 2.MemberField객체의 멤버변수4개에 데이타대입
		mfObject.mVariable1 = "HI,";
		mfObject.mVariable2 = "I am";
		mfObject.mVariable3 = "MeberField";
		mfObject.mVariable4 = "Variable!";

		// 3.MemberField객체의 4개멤버변수내용출력
		System.out.print(mfObject.mVariable1 + " ");
		System.out.print(mfObject.mVariable2 + " ");
		System.out.print(mfObject.mVariable3 + " ");
		System.out.print(mfObject.mVariable4);
	}

}