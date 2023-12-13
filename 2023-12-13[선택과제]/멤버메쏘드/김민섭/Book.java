package com.itwill01.Method;

public class Book {

	/*
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   
	 *   - 책정보출력
	 *   - 책정보대입
	 *   
	 */

	private int bookNo;
	private String bookName;
	private String bookCat;
	private String bookExp;

	public void bookInfo(int bookNo, String bookName, String bookCat, String bookExp) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookCat = bookCat;
		this.bookExp = bookExp;

	}

	public void print() {
		System.out.printf("%5d %20s %20s %20s\n", this.bookNo, this.bookName, this.bookCat, this.bookExp);
	}

	public int getBookNo() {
		System.out.printf("%5d %20s %20s %20s\n", this.bookNo, this.bookName, this.bookCat, this.bookExp);
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		System.out.printf("%5d %20s %20s %20s\n", this.bookNo, this.bookName, this.bookCat, this.bookExp);
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookCat() {
		System.out.printf("%5d %20s %20s %20s\n", this.bookNo, this.bookName, this.bookCat, this.bookExp);
		return bookCat;
	}

	public void setBookCat(String bookCat) {
		this.bookCat = bookCat;
	}

	public String getBookExp() {
		System.out.printf("%5d %20s %20s %20s\n", this.bookNo, this.bookName, this.bookCat, this.bookExp);
		return bookExp;
	}

	public void setBookExp(String bookExp) {
		this.bookExp = bookExp;
	}

	public void header() {

		System.out.println("  번호\t\t\t제목\t\t\t\t분류\t\t\t설명");

	}

}
