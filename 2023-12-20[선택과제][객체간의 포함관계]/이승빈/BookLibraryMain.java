package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember = new BookMember(1234, "이 책", "010-1234-5678", null);
		/*
		 * 책객체들생성
		 */
		Book[] books = new Book[2];
		
		books[0] = new Book(34636, "야무지게 먹어야지", "여가/요리", "맛있는 요리 방법");
		books[1] = new Book(23427, "정보처리기사 필기", "교육/참고서", "정보처리기사 교육서");
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setBooks(books);
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.print();
		Book.headerPrint();
		for (int i = 0; i < books.length; i++) {
			books[i].print();
		}
	}
	
}
