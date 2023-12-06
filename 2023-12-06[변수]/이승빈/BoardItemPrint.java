
public class BoardItemPrint {

	public static void main(String[] args) {
		int number1;
		String title1;
		String date1;
		String writer1;
		int view1;
		
		int number2;
		String title2;
		String date2;
		String writer2;
		int view2;
		
		number1 = 001;
		title1 = "서울시 내 행사 일정 관련 질의";
		date1 = "2023-05-21";
		writer1 = "김ㅇ훈";
		view1 = 35;
		
		number2 = 002;
		title2 = "서울시 도시정비사업 관련 질의";
		date2 = "2023-08-13";
		writer2 = "이ㅇ희";
		view2 = 21;
		
		System.out.println("# 민원게시판");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("| 번호 |               제목               |  신청일시  |  작성자  | 조회수 |");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("   "+number1+"      "+title1+"     "+date1+"    "+writer1+"      "+view1);
		System.out.println("   "+number2+"      "+title2+"     "+date2+"    "+writer2+"      "+view2);
		System.out.println("----------------------------------------------------------------------------");

	}

}
