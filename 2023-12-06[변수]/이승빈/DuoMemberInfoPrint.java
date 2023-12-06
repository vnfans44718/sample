
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 변수선언
		 */
		int usernumber;
		String name;
		String registrationnumber;
		char gender;
		int married;
		String smoke;
		double height;
		String mbti;
		String appearance;
		/*
		 * 변수에데이타 대입
		 */
		usernumber = 143524;
		name = "이승빈";
		registrationnumber = "123456-1234567";
		gender = '남';
		married = 0;
		smoke = "false";
		height = 168.5;
		mbti = "ENFJ";
		appearance = "단정";	
		/*
		 * 변수내용출력
		 */
		System.out.println("**********<< 고객정보 >>**********");
		System.out.println("1.회원번호 : "+usernumber);
		System.out.println("2.이    름 : "+name);
		System.out.println("3.주민번호 : "+registrationnumber);
		System.out.println("4.성    별 : "+gender);
		System.out.println("5.결혼횟수 : "+married);
		System.out.println("6.흡연여부 : "+smoke);
		System.out.println("7.신    장 : "+height);
		System.out.println("8. M B T I : "+mbti);
		System.out.println("9.용    모 : "+appearance);
		System.out.println("********************************");

	}

}
