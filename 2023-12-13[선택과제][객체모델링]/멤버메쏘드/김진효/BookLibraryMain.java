package com.itwill01.method;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		
		/*
		 * 책객체생성
		 */

		Book infoOfBook = new Book();

		/*
		 * 책정보대입메쏘드호출
		 */

		infoOfBook.bookData(54443, "우리가 빛의 속도로 갈 수 없다면", "국내도서(소설)", "2023 종합 베스트셀러, SF 한국소설");

		/*
		 * 책정보출력메쏘드호출
		 */
		infoOfBook.headerPrint();
		infoOfBook.print();
	}
}