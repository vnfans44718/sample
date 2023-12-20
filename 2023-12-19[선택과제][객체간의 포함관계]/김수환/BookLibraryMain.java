package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember member=new BookMember();
		
		/*
		 * 책객체생성
		 */
		Book book=new Book();
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		member.setNo(1);
		member.setName("김수환");
		member.setPhoneNumber("01049962719");
		member.setBook(book);
		book.setNo(1);
		book.setTitle("바다");
		book.setGenre("호러");
		book.setDetail("바다에서 상어를만나다");
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		member.headPrint();
		member.print();
		
		
	}
}