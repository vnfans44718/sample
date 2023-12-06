
public class Quiz_231206 {

	public static void main(String[] args) {
		
		/****************************************************************************/
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나 400의배수(400로나누어떨어지는수)가 윤년
		 */
		
		int year = 2023;
		boolean R1 = (year%4) == 0;
		boolean R2 = (year%100) != 0;
		boolean R3 = (year%400) == 0;
		boolean isLeapYear = R1 && (R2 || R3);
		System.out.println(year+ "의 윤년여부:"+isLeapYear);
		
		

	
		
		/*
		 * Quiz: 한글여부판단
		 */ 
		
		
		char c = '＠';
		char H1= 44032;
		char H2= 55203;
		
		boolean isHangul = (c >= H1 ) && (c <= H2);
		System.out.println("한글여부: " + isHangul );
		
		
		
		/*
		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
		 */
		char idFirstLetter = '@';
		char E1 = 65;
		char E2 = 90;
		char E3 = 97;
		char E4 = 122;
		
		boolean AlphabetUpper = (idFirstLetter >= E1 ) && (idFirstLetter <= E1 );
		boolean AlphabetCapital = (idFirstLetter >= E3 ) && (idFirstLetter <= E4 );
		
		
		boolean isValidIdFirstLetter= AlphabetUpper || AlphabetCapital;
		System.out.println(idFirstLetter+"의 적합성여부: "+isValidIdFirstLetter);
		
	}

}
