package com.itwill01.method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	 */
	private int num;
	private String title;
	private String type;

	/* <<기능>>
	 *   - Dvd정보대입
	 *   - Dvd정보출력
	 *   
	 */
	public void dvdInfo(int num, String title, String type) {
		this.num = num;
		this.title = title;
		this.type = type;

	}

	public void dvdHeadPrint() {
		System.out.println("==================");
		System.out.printf("%s %6s%6s\n", "번호", "타이틀", "장르");
	}

	public void dvdPrint() {
		System.out.printf("%d %7s%7s\n", num, title, type);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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