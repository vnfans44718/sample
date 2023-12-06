
public class BoardItemPrint {

	public static void main(String[] args) {

		int num1;
		String title;
		String name;
		String date;
		int num2;
		
		num1 = 486;
		title = "고양이는 너무 귀엽지 않나요? 반박은 거절(32)";
		name = "김미진";
		date = "2023-12-06";
		num2 = 259687;
		
		String content = "│ "+num1+" │ "+title+" │ "+name+" │ "+date+" │ "+num2+" │ ";
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("│ NO  │                    제  목                    │ 작성자 │   작성일   │ 조회수 │");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(content);
	}

}
