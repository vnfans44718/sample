package com.itwill01.method;

public class BookLibraryMain {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.inputBook(99, "정보처리기사필기1", "정보통신", "자격증무조건따세요");

		book1.headerPrint();
		book1.dataPrint();
	}

}
