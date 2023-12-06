
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		

		/*
		 * 변수선언
		 */
		int		MemberNum;
		String	MemberName;
		int		MemberClassifyNumberFront;
		int		MemberClassifyNumberBehind;
		char	MemberSex;
		int		MemberMarriageNumber;
		boolean	MemberSmoking;
		double	MemberHeight;
		char	MemberGrade;
		String	MemberFace;
		
		
		/*
		 * 변수에데이타 대입
		 */
		MemberNum= 236514;
		MemberName= "홍길동";
		MemberClassifyNumberFront= 201212;
		MemberClassifyNumberBehind= 3495039;
		MemberSex= '남';
		MemberMarriageNumber= 0;
		MemberSmoking = true;
		MemberHeight = 178.3;
		MemberGrade = 'A';
		MemberFace = "상(중)";
		
		
		
		/*
		 * 변수내용출력
		 */
		System.out.println("*************************");
		System.out.println("회원번호 : "+ MemberNum);
		System.out.println("이    름 : "+ MemberName);
		System.out.println("주민번호 : "+ MemberClassifyNumberFront + "-" + MemberClassifyNumberBehind);
		System.out.println("성    별 : "+ MemberSex);
		System.out.println("결혼횟수 : "+ MemberMarriageNumber);
		System.out.println("흡연여부 : "+ MemberSmoking);
		System.out.println("키       : "+ MemberHeight);
		System.out.println("학    점 : "+ MemberGrade);
		System.out.println("용    모 : "+ MemberFace);
		System.out.println("*************************");

		
		
		/*
		 * 출력예시 2번째 
		 */
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		MemberNum= 145894;
		MemberName= "김ㅇㅇ";
		MemberClassifyNumberFront= 189451;
		MemberClassifyNumberBehind= 8459758;
		MemberSex= '여';
		MemberMarriageNumber= 0;
		MemberSmoking = false;
		MemberHeight = 168.5;
		MemberGrade = 'A';
		MemberFace = "상(중상)";
		
		System.out.println("****************************************************************************************************");
		System.out.println("\t이름" + "\t주민번호" + "\t성별" + "\t결혼횟수" + "\t흡연여부" + "\t키" + "\t학점" + "\t용모");
		System.out.println( "\t" +MemberName + "\t" +MemberClassifyNumberFront + "-" + MemberClassifyNumberBehind + "\t" +MemberSex + "\t" +MemberMarriageNumber + "\t\t" +MemberSmoking + "\t\t" +MemberHeight + "\t" +MemberGrade + "\t" +MemberFace);
		System.out.println("****************************************************************************************************");
		
	}

}
