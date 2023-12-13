package com.itwill01.method;

public class BookLibraryMain {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();

		book1.infoBook(1, "12가지 인생의 법칙", "조던 B.피터슨", "메이븐", "자기계발서", "혼돈의 해독제");
		book2.infoBook(2, "혼자 공부하는 자바", "신용권", "한빛미디어", "컴퓨터", "1:1 과외처럼 공부하고싶을 때");
		book3.infoBook(3, "미움받을용기", "기시미 이치로", "다이아몬드", "정신분석학", "심리학을 참고해서 쓴 대화체 형식의 도서");

		book1.headerPrint();
		book1.print();
		book2.print();
		book3.print();
	}

}
