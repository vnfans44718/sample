package com.itwill01.method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	 */

	private int no;
	private String title;
	private String type;

	/* <<기능>>
	*   - Dvd정보대입
	*   - Dvd정보출력
	*   
	*/

	public void setData(int no, String title, String type) {
		this.no = no;
		this.title = title;
		this.type = type;
	}

	public void headerPrint() {
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.printf("%s %7s %7s\n", "번호", "타이틀", "쟝르");
	}

	public void print() {
		System.out.printf("%d %s %s\n", this.no, this.title, this.type);
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}