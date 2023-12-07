
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		int 회원번호=236514;
		int 주민번호앞자리=201212;
		int 주민번호뒷자리=3495039;
		char 성별='남';
		char 결혼횟수='\u0030';
		char 학점='\u0041';
		String 이름="홍길동";
		String 용모="상(중)";
		boolean 흡연여부=true;
		double 키=178.3;
		
		
		System.out.println("******************************");
		System.out.println("회원번호 : "+회원번호);
		System.out.println("이    름 : "+이름);
		System.out.println("주민번호 : "+주민번호앞자리+"-"+주민번호뒷자리);
		System.out.println("성    별 : "+성별);
		System.out.println("결혼횟수 : "+결혼횟수);
		System.out.println("흡연여부 : "+흡연여부);
		System.out.println("키       : "+키);
		System.out.println("학     점: "+학점);
		System.out.println("용     모: "+용모);
		System.out.println("******************************");

	}

}
