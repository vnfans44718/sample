package com.itwill01.method;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 책객체생성
		 */
		Book book = new Book();

		/*
		 * 책정보대입메쏘드호출
		 */
		book.setBookInfoData(123, "자바 -끝-", "IT/네트워크", "자바의 신이 되려면 무조건 읽어야하는 책");

		/*
		 * 책정보출력메쏘드호출
		 */
		book.headerPrirnt();
		book.print();
	}

}