
public class BoardItemPrint {

	public static void main(String[] args) {
		// 회원번호 제목 작성자 작성일 조회수 
		
		int memberNum = 1 ;
		String title = "전세 사기범 잡았습니다";
		String reviewer = "김덕배";
		String date = "2023-12-06";
		int views = 2656948; 
		String content = "회원번호 제목 작성자 작성일 조회수";
		String line = "---------------------------------------------";
		
		System.out.println(line);
		System.out.println(content);
		System.out.println(line);
		System.out.println(memberNum+" "+title+" "+reviewer+" "+date+" "+views);
		System.out.println(line);
	
	}

}
