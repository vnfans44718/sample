package com.itwill03.포함.배열포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		
		BookMember member1 = new BookMember(1089, "이시럽", "01075681256");
		BookMember member2 = new BookMember(2462, "최토핑", "01026171088");
		BookMember member3 = new BookMember(3177, "김설탕", "01033852745", null);
		BookMember member4 = new BookMember(8901, "박연유", "01089175907", null);
		
		Book[] rentBooks1 = {
				new Book(78, "더 검은 밤", "소설", "몽환과 영원의 세계"),
				new Book(99, "무빙워크", "시", "정물이 되어본 적 있는 당신에게"),
		};
		
		Book[] rentBooks2 = {
				new Book(13, "살구 칵테일", "철학", "사르트르와 하이데거의 이야기"),
				new Book(57, "사랑 파먹기", "소설", "내가 네게 질 것 같으냐"),
		};	
		
		member3.setBooks(rentBooks1);
		member4.setBooks(rentBooks2);
		
		BookMember.headerPrint(); 
		member1.memberPrint();
		System.out.println();
		BookMember.headerPrint();
		member2.memberPrint();
		System.out.println();
		BookMember.headerPrint();
		member3.memberPrint();
		System.out.println();
		BookMember.headerPrint();
		member4.memberPrint();
		System.out.println();
		
		
	
	}
}