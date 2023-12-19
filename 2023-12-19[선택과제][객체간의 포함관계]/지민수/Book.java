package com.itwill03.포함;

public class Book {

	private int no;
	private String title;
	private String category;
	private String ex;

	public Book() {
	}

	public Book(int no, String title, String category, String ex) {
		super();
		this.no = no;
		this.title = title;
		this.category = category;
		this.ex = ex;
	}

	public void print() {
		System.out.println(no + "\t" + title + "\t" + category + "\t" + ex);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

}
