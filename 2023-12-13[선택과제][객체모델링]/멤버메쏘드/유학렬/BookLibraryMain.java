package com.itwill01.method;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		
		/*
		 * 책객체생성
		 */

		Book book1 = new Book();

		/*
		 * 책정보대입메쏘드호출
		 */

		book1.setData(1111, "혼자공부하는 자바", "교육서", "자바를 공부하는 이들이 쉽게 배울 수 있는 자바에 관한 공부책");

		/*
		 * 책정보출력메쏘드호출
		 */

		book1.headerPrint();
		book1.print();

	}
}