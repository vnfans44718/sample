package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		
		BookMember member1 = new BookMember(1089, "이시럽", "01075681256", null);
		BookMember member2 = new BookMember(2462, "최토핑", "01026171088", null);
		BookMember member3 = new BookMember(3177, "김설탕", "01033852745", null);
		
		Book book1 = new Book(78, "더 검은 밤", "소설", "몽환과 영원의 세계");
		Book book2 = new Book(99, "무빙워크", "시", "정물이 되어본 적 있는 당신에게");
		Book book3 = new Book(13, "살구 칵테일", "철학", "사르트르와 하이데거의 이야기");
		
		member1.setBook(book1);
		member2.setBook(book2);
		member3.setBook(book3);
		
		BookMember.headerPrint();
		member1.memberPrint();
		member2.memberPrint();
		member3.memberPrint();
	
	}
}
