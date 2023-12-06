
public class Quiz {

	public static void main(String[] args) {
		
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 *    - 400의배수(400로나누어떨어지는수)
		 */
		
		int year = 2023;
		boolean isLeapYear = ((year % 4 == 0) && (year%100!=0) || (year%400==0));
		
		/*
		 * if ((year % 4 == 0) && (year%100!=0) || (year%400==0)) {
			isLeapYear = true;
		}
		 */
		
		System.out.println(year+ "의 윤년여부:"+isLeapYear);
		
		
		/*
		 * Quiz: 한글여부판단
		 *  
		 */
		char c = '비';
		boolean isHangul = (c >= '가' && c <='힣') || (c >= 'ㄱ' && c <= 'ㅎ');
		System.out.println("한글여부:"+isHangul);
		
		/*
		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
		 */
		char idFirstLetter = 'a';
		boolean isValidIdFirstLetter = (idFirstLetter >= 'A' && idFirstLetter <='Z') || (idFirstLetter >= 'a' && idFirstLetter <='z');
		System.out.println(idFirstLetter+" 의 적합성여부:"+isValidIdFirstLetter);
	
		
	}

}
