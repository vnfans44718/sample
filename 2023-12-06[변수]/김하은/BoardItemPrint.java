
public class BoardItemPrint {

	public static void main(String[] args) {
		
		int number;
		String title;
		String name;
		String date;
		int view;
		String seoulBoard;
		
		number=16406;
		title="겉다로고 속다르다";
		name="김*학";
		date="2023.12.06";
		view=1;
		seoulBoard=number+"   "+title+"    "+name+"      "+date+"    "+view;
		
		System.out.println("------------------------------------------------------------");
		System.out.println("순번    제목                 작성자     작성일        조회수");		
		System.out.println("------------------------------------------------------------");
		System.out.println(seoulBoard);

	}

}
