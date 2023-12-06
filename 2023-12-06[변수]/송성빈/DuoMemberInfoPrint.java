
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		 int 회원번호;
		 String 이름 ;
		 int 주민번호앞;
		 int 주민번호뒤;
		 char 성별;
		 int 결혼횟수;
		 boolean 흡연여부;
		 double 키    ;
		 char 학점;
		 String 용모;
		 
		 회원번호 = 236514;
		 이름 = "홍길동";
		 주민번호앞 = 201212;
		 주민번호뒤 = 3495039;
		 성별 = '남';
		 결혼횟수 = 0;
		 흡연여부 = true;
		 키 = 178.3;
		 학점 = 'A';
		 용모 = "상(중)";
		 
		 System.out.println("회원번호 : " + 회원번호);
		 System.out.println("이    름 : " + 이름);
		 System.out.println("주민번호 : " + 주민번호앞+"-"+주민번호뒤);
		 System.out.println("성    별 : " + 성별);
		 System.out.println("결혼횟수 : " + 결혼횟수);
		 System.out.println("흡연여부 : " + 흡연여부);
		 System.out.println("키       : " + 키);
		 System.out.println("학    점 : " + 학점);
		 System.out.println("용    모 : " + 용모);

	}

}
