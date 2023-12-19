package com.itwill01.method;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
			
			/*
			 * 책객체생성
			 */
		Book book = new Book();
		/*
		 * 책정보대입메쏘드호출
		 */
		book.myBook(1, "행복해? 햄볶아!", "에세이", "행복하면 햄을 볶는 사람의 이야기");
		/*
		 * 책정보출력메쏘드호출
		 */
		book.headerPrint();
		book.print();
	}

}
