package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMem1 = new BookMember(123, "이짜장", "010-1234-5678", null);
		BookMember bookMem2 = new BookMember(678, "김짬뽕", "010-7890-1245", null);
		/*
		 * 책객체생성
		 */
		Book book1 = new Book(1041, "자바개발자 어렵지 않아요", "IT/네트워크", "자바개발자가 되기위한 노하우 전수");
		Book book2 = new Book(2532, "수상안전교육 개정판", "교육", "수상안전요원을 위한 지침서");
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bookMem1.setBook(book1);
		bookMem2.setBook(book2);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bookMem1.print();
		bookMem2.print();
		
	}
}