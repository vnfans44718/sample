package com.itwill03.포함;

public class Dvd {

	private int no;
	private String title;
	private String category;

	public Dvd() {

	}

	public Dvd(int no, String title, String category) {
		super();
		this.no = no;
		this.title = title;
		this.category = category;
	}

	public void print() {
		System.out.println(no + "\t" + title + "\t" + category);
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

}
