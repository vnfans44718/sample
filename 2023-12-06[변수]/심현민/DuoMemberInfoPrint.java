
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/* 
		 * 출력예시1
		 */
		
		int membershipNumber = 236514;
		String name = "홍길동";
		int registrationNumber1 = 201212;
		int registrationNumber2 = 3495039;
		String gender = "남";
		int weddingCount = 0;
		boolean smokingStatus = true;
		double height = 178.3;
		char grade = 'A';
		String appearance = "상(중)";
		
		System.out.println("*************************");
		System.out.println("회원번호 : "+membershipNumber);
		System.out.println("이름 : "+name);
		System.out.println("주민번호 : "+ registrationNumber1 +"-"+registrationNumber2);
		System.out.println("성별 : "+gender);
		System.out.println("결혼횟수 : "+weddingCount);
		System.out.println("흡연여부 : "+smokingStatus);
		System.out.println("키 : "+height);
		System.out.println("학점 : "+grade);
		System.out.println("용모 : "+appearance);
		System.out.println("*************************");
		
		/*
		 * 출력예시2
		 */
		
		membershipNumber = 12345;
		name = "김ㅇㅇ";
		registrationNumber1 = 123456;
		registrationNumber2 = 1234567;
		gender = "남";
		weddingCount = 1;
		smokingStatus = false;
		height = 190.1;
		grade = 'B';
		appearance = "중(하)";
		

		System.out.println("\n\n\n\n****************************************************************************************************");
		System.out.println("회원번호\t이름\t주민번호\t성별\t결혼횟수\t흡연여부\t키\t학점\t용모");
		System.out.println("\n****************************************************************************************************");
		System.out.print(membershipNumber);
		System.out.print("\t " + name);
		System.out.print("\t " + registrationNumber1 +"-"+registrationNumber2);
		System.out.print("\t\t" + gender);
		System.out.print("\t " + weddingCount);
		System.out.print("\t\t" + smokingStatus);
		System.out.print("\t\t" + height);
		System.out.print("\t " + grade);
		System.out.print("\t " + appearance);
		
		
		
		
		
		
		
		
	}

}
