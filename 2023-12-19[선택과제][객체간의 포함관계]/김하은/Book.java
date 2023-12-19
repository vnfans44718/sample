package com.itwill03.포함;

public class Book {
	
	private int bookNo;
	private String bookTitle;
	private String bookGenre;
	private String bookDetail;
	
	public Book() {
	}

	public Book(int bookNo, String bookTitle, String bookGenre, String bookInfo) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookDetail = bookInfo;
	}
	
	public void bookPrint() {
		System.out.println("\t"+bookNo+"\t"+bookTitle+"\t"+bookGenre+"\t"+bookDetail);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookInfo() {
		return bookDetail;
	}

	public void setBookInfo(String bookDetail) {
		this.bookDetail = bookDetail;
	}
	
}
