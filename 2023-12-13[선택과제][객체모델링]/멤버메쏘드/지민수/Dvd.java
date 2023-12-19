package com.itwill01.method;

public class Dvd {

	private int no;
	private String title;
	private String category;

	public void infoDvd(int no, String title, String category) {
		this.no = no;
		this.title = title;
		this.category = category;
	}

	public void headerPrint() {
		System.out.println("---------------------------------");
		System.out.printf("%4s %-10s %s\n", "번호", "제목", "장르");
		System.out.println("---------------------------------");
	}

	public void Print() {
		System.out.printf("%4d %-10s %s\n", this.no, this.title, this.category);
	}
}
