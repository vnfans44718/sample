package com.itwill01.method;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		
		/*
		 * 책객체생성
		 */
		Book book1 = new Book();
		Book book2 = new Book();

		/*
		 * 책정보대입메쏘드호출
		 */
		book1.bookInfo(1, "혼공자", "자기계발서", "혼자 자바공부를 할수있다");
		book2.bookInfo(2, "수제비", "자기계발서", "정보처리기사 합격 할수있다");
		/*
		 * 책정보출력메쏘드호출
		 */
		book1.bookInFoHeadPrint();
		book1.bookInfoPrint();
		book2.bookInfoPrint();
	}
}