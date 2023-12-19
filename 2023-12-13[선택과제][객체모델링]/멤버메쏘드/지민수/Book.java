package com.itwill01.method;

public class Book {

	private int no;
	private String title;
	private String category;
	private String explanation;
	private String writer;
	private String publisher;

	public void infoBook(int no, String title, String writer, String publisher, String category, String explanation) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.category = category;
		this.explanation = explanation;
	}

	public void headerPrint() {
		System.out.println("---------------------------------");
		System.out.printf("%-4s %10s %25s %18s %10s %25s\n", "번호", "제목", "저자", "출판사", "분류", "설명");
		System.out.println("---------------------------------");
	}

	public void print() {
		System.out.printf("%4d %14s %20s %14s %8s %25s\n", this.no, this.title, this.writer, this.publisher,
				this.category, this.explanation);
	}

}
