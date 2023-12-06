
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
	
		// 회원정보 출력 
		System.out.println("1.회원번호 출력"); 
		System.out.println("***************************************************************************************************");
		System.out.println("회원번호"+"\t이름"+"\t주민번호"+"\t성별"+"\t결혼횟수"+"\t흡연여부"+"\t키"+"\t학점"+"\t용모");	
		System.out.println("***************************************************************************************************");
		System.out.println("12345"+"\t"+"\t김경호"+"\t235584-2631542"+"\t남"+"\t1"+"\t"+"\ttrue"+"\t"+"\t187.3"+"\tA"+"\t하");	
		System.out.println();
		System.out.println();
		
		//게시판 아이템 출력 
		
		System.out.println("2.게시판 아이템 출력"); 
		System.out.println();
		System.out.println("[자유게시판]");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("No"+"\t"+"\t"+"\t제목"+"\t"+"\t"+"\t글쓴이"+"\t"+"\t"+"\t작성시간"+"\t좋아요"); 
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("3"+"\t"+"\t"+"\t응원합니다!~"+"\t"+"\t제임스"+"\t"+"\t"+"\t2023.10.30."+"\t1"); 
		System.out.println("2"+"\t"+"\t"+"\t한국,가즈아~"+"\t"+"\t축구왕"+"\t"+"\t"+"\t2023.10.29."+"\t3"); 
		System.out.println("1"+"\t"+"\t"+"\t제발 이기길"+"\t"+"\t통키"+"\t"+"\t"+"\t2023.10.29."+"\t0"); 
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		
		//상품 아이템 출력 
		System.out.println("3.상품 아이템 출력"); 
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("|"+"[레코브]"+"\t"+"관심고객수 39,567,887명"+"	\u2728 알림받기"+"\t"+"|");
		System.out.println("|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
		System.out.println("|"+"[레코브]겨울 니트후드 다운 오리털 패딩점퍼 (LC357011KJ)"+"|");
		System.out.println("|"+"매장인기상품 18% 할인"+"\t"+"\t"+"\t"+"회원 106,600원"+"\t"+"|");
		System.out.println("|"+"-------------------------------------------------------"+"|");
		System.out.println("|"+"레코브 고객을 위한 혜택"+"\t"+"\t"+"\t"+"\t"+"|");
		System.out.println("|"+"최대적립포인트 1,300원!"+"\t"+"\t"+"\t"+"\t"+"|");
		System.out.println("--------------------------------------------------------");
		
		
		//퀴즈
		System.out.println();
		System.out.println();
		System.out.println("1.윤년여부판단"); 
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나 
		 *      400의배수(400로나누어떨어지는수)가 윤년
		 */
		int year = 2023;
		boolean isLeapYear = ((year%4 == 0) && (year%100 != 0))||(year%400 == 0);
		System.out.println(year+ "의 윤년여부:"+isLeapYear);
		
		
		System.out.println();
		System.out.println("2.한글여부판단"); 
		/*
		 * Quiz: 한글여부판단  
		 */
		char c = '＠';
		boolean isHangul = (c >='가'&& c<='힣');
		System.out.println("한글여부:"+isHangul);
		/* 한글의 십진수 유니코드 
		 * 가 44032, 힣55203 
		 */
		System.out.println();
		System.out.println("3.@의 적합성 여부");
		/*
		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
		 */
		char idFirstLetter = '@';
		boolean idValidIdFirstLetter = ('@'>='a' &&'@'<='z');
		System.out.println(idFirstLetter+" 의 적합성여부:"+idValidIdFirstLetter);
		
		
	}

}
