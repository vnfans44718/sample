package com.itwill01.method;

public class Book {
	/*
	
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */
	private int num;
	private String name;
	private String bookKind;
	private String bookExplan;

	/* <<기능>>
	*   
	*   - 책정보출력
	*   - 책정보대입
	*   
	*/
	public void bookInfo(int num, String name, String bookKind, String bookExplan) {
		this.num = num;
		this.name = name;
		this.bookKind = bookKind;
		this.bookExplan = bookExplan;
	}

	public void bookInFoHeadPrint() {
		System.out.println("=========================================");
		System.out.printf("%s %5s %7s %7s\n", "책번호", "책제목", "책분류", "책설명");
	}

	public void bookInfoPrint() {
		System.out.printf("%d %10s %5s %15s\n", num, name, bookKind, bookExplan);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookKind() {
		return bookKind;
	}

	public void setBookKind(String bookKind) {
		this.bookKind = bookKind;
	}

	public String getBookExplan() {
		return bookExplan;
	}

	public void setBookExplan(String bookExplan) {
		this.bookExplan = bookExplan;
	}
}