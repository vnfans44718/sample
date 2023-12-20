package com.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */

		BookMember m1 = new BookMember(1, "일번이", 01012334566);
		BookMember m2 = new BookMember(2, "이번이", 01012331233);
		BookMember m3 = new BookMember(3, "삼번이", 01012334566);

		/*
		 * 책객체생성
		 */

		Book b1 = new Book(1, "배려", "소설", "다른사람에 대한 이해와 존중");
		Book b2 = new Book(2, "실행이답이다.", "자기개발", "목표를 이루기위한 자세");
		Book b3 = new Book(3, "나는 당신이 행복했으면 좋겠습니다", "시", "인생이야기");

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */

		m1.setBook(b1);
		m2.setBook(b2);
		m3.setBook(b3);

		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		BookMember.headPrint();
		m1.print();
		m2.print();
		m3.print();

//		
	}

}
