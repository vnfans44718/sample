package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember = new BookMember(1, "김경호", "010-0000-0000", null);

		/*
		 * 책객체생성
		 */
		Book book = new Book(1, "나의 라임 오렌지나무", "소설", "모름");

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setBook(book);

		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bookMember.print();

	}
}