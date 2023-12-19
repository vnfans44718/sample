package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {

		/*
		 * 회원객체생성
		 */
		BookMember bookMember = new BookMember(1, "김미진", "010-1234-5678", null);
		/*
		 * 책객체생성
		 */
		Book book = new Book(19970317, "행복해? 햄볶아!", "에세이", "행복하면 햄을 볶는 사람의 소소한 일상 이야기");
		/*
		 * 회원이 책을 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setBook(book);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bookMember.headerPrint();
		bookMember.print();

	}
}