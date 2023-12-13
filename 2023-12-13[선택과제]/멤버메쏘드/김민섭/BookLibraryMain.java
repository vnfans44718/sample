package com.itwill01.Method;

public class BookLibraryMain {

	public static void main(String[] args) {

		/*
		 * 책객체생성
		 */

		/*
		 * 책정보대입메쏘드호출
		 */

		/*
		 * 책정보출력메쏘드호출
		 */

		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();

		book1.bookInfo(001, "달러구트의 꿈백화점", "판타지소설", "꿈을 파는 백화점사장 이야기");
		book2.bookInfo(002, "데일카네기 인간관계론", "자기계발", "타인과의 관계유지에 관한 이야기");
		book3.bookInfo(003, "불편한 편의점", "소설", "편의점에서 벌어지는 소소한 이야기");
		book4.bookInfo(004, "역행자", "자기계발", "성공에 관한 이야기");

		book1.header();
		book1.getBookNo();
		book1.setBookNo(005);
		book1.print();
		book2.getBookName();
		book2.setBookName("혼자 공부하는 자바");
		book2.print();
		book3.getBookCat();
		book3.setBookCat("자기계발");
		book3.print();
		book4.getBookExp();
		book4.setBookExp("자바언어 배우기");
		book4.print();
	}

}
