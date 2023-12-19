package com.itwill01.method;

public class Book {
	/*
	
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 */

	private int no;
	private String name;
	private String kind;
	private String ex;

	/* <<기능>>
	*   
	*   - 책정보출력
	*   - 책정보대입
	*   
	*/

	public void setData(int no, String name, String kind, String ex) {
		this.no = no;
		this.name = name;
		this.kind = kind;
		this.ex = ex;
	}

	public void headerPrint() {
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%s %6s %11s %25s\n", "책번호", "책이름", "책분류", "책설명");
	}

	public void print() {
		System.out.printf("%5d %s %4s %s\n", no, name, kind, ex);
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

}