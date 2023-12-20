package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */

		/*
		 * 책객체생성
		 */

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */

		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */

		Book book1 = new Book(1, "혼공자", "교육", "자바 교육을 위한 책");
		BookMember bookMember1 = new BookMember();
		bookMember1.setNo(1);
		bookMember1.setName("유학렬");
		bookMember1.setPhone("010-1111-1111");
		bookMember1.setBook(book1);
		System.out.println();

		BookMember allInfo = new BookMember(1, "유학렬", "010-1111-1111", book1);

		BookMember.headerPrint();
		allInfo.print();

	}
}