/*
 * 변수를 이용하여 정보 출력하기
 */
public class DuoMemberInfoPrint {

	public static void main(String[] args) {

		int number = 123456 ;
		String name = "정수빈" ;
		String number2 = "123456-1234567";
		char gender = '여';
		int marry = 0;
		boolean smoking = false;
		double height = 160;
		char score = 'A';
		char face = '하';
		
		System.out.println("*************************");
		System.out.println("회원번호 : " + number);
		System.out.println("이    름 : " + name);
		System.out.println("주민번호 : " + number2);
		System.out.println("성    별 : " + gender);
		System.out.println("결혼횟수 : " + marry);
		System.out.println("흡연여부 : " + smoking);
		System.out.println("키       : " + height);
		System.out.println("학    점 : " + score);
		System.out.println("용    모 : " + face);
		System.out.println("*************************");
		
		System.out.println();
		
		System.out.println("***********************************************************************");
		System.out.println("회원번호 이름    주민번호      성별  결혼횟수  흡연여부 키   학점 용모");
		System.out.println("***********************************************************************");
		System.out.println(" "+ number +" " + name + " "+number2 + "   "+ gender + "      "+marry + "      "+smoking + "   "+height + "  "+score + "   "+face);
		System.out.println();
		/*
		 * 윤년여부 판단하기
		 */
		
		int year = 2023;
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	
		System.out.println(year+ "의 윤년여부:"+isLeapYear);
		
		/*
		 * 한글여부판단
		 */
		
		char c = '@';
		boolean isHangul = (c >='가' && c <='힣');
		System.out.println("한글여부:"+isHangul);
		
		/*
		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
		 */
		
		char idFirstLetter = '@';
		boolean isValidIdFirstLetter= (idFirstLetter >='a' && idFirstLetter <='z' ) || (idFirstLetter >='A' && idFirstLetter <='Z');
		System.out.println(idFirstLetter+" 의 적합성여부:"+isValidIdFirstLetter);
		
	}

}
