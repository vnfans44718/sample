
public class uoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 변수선언
		 */
		int memberNumber;
		String name;
		String privateNumber;
		String sex;
		int numberOfMarriages;
		boolean smoking;
		double height;
		String grade;
		String appearance;
		/*
		 * 변수에데이타 대입
		 */
		 memberNumber=123123;
		 name="김수환";
		 privateNumber="000000-0000000";
		 sex="남";
		 numberOfMarriages=1;
		 smoking=true;
		 height=180.3;
		 grade="A+";
		 appearance="상(중)";
		 
		 
		/*
		 * 변수내용출력
		 */
		System.out.println("출력예시 1");
		System.out.println("**************************");
		System.out.println("회원번호 : " +memberNumber);
		System.out.println("이    름 : "+name);
		System.out.println("주민번호 : "+privateNumber);
		System.out.println("성    별 : "+sex);
		System.out.println("결혼횟수 : "+numberOfMarriages);
		System.out.println("흡연여부 : "+smoking);
		System.out.println("키       : "+height);
		System.out.println("학    점 : "+grade);
		System.out.println("용    모 : "+appearance);
		System.out.println("**************************");
		System.out.println("==========================");
		System.out.println("출력예시 2");
		System.out.println("**********************************************************************************");
		System.out.println("회원번호    이름      주민번호      성별    결혼횟수    흡연여부    키    학점    용모");
		System.out.println(" "+memberNumber+"    "+name+"  "+privateNumber+"    "+sex+"         "+numberOfMarriages+"        "+smoking+"      "+height+"   "+grade+"    "+appearance);
		System.out.println("**********************************************************************************");
		
	
	}
}
