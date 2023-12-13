package com.itwill01.method;

public class Book {
	/*
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
		 */
	private int no;
	private String name;
	private String type;
	private String story;

	/* <<기능>>
	 *   
	 *   - 책정보출력
	 *   - 책정보대입
	 *   
	 */
	public void myBook(int no, String name, String type, String story) {
		this.no = no;
		this.name = name;
		this.type = type;
		this.story = story;
	}

	public void headerPrint() {
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s %10s %10s %15s \n", "책번호", "책제목", "책분류", "책설명");
		System.out.println("--------------------------------------------------------------");
	}

	public void print() {
		System.out.printf("%3d %14s %6s %s \n", no, name, type, story);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

}
