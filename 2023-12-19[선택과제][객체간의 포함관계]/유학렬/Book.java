package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */

	private int no;
	private String name;
	private String type;
	private String info;

	public Book() {

	}

	public Book(int no, String name, String type, String info) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.info = info;
	}

	public static void headerPrint() {
		System.out.println("------------------------책 정보 출력-------------------------");
		System.out.printf("%s %s %s %s\n", "번호", "이름", "분류", "정보");
	}

	public void print() {
		System.out.printf("%4d %5s %s %s", no, name, type, info);
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}