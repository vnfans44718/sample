package com.itwill03.포함.배열포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		
		BookMember member1 = new BookMember(3177, "김설탕", "01033852745", null);
		
		Book[] books = {
				new Book(78, "더 검은 밤", "소설", "몽환과 영원의 세계"),
				new Book(99, "무빙워크", "시", "정물이 되어본 적 있는 당신에게"),
				new Book(13, "살구 칵테일", "철학", "사르트르와 하이데거의 이야기")
				};
		
		member1.setBooks(books);
		
		BookMember.headerPrint(); 
		member1.memberPrint();
		
	
	}
}
