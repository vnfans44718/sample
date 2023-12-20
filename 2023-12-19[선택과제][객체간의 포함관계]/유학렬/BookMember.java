package com.itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/

	/*
	<<기능>>
	  회원정보출력 
	 */

	private int no;
	private String name;
	private String phone;
	private Book book;

	public BookMember() {

	}

	public BookMember(int no, String name, String phone, Book book) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.book = book;
	}

	public static void headerPrint() {
		System.out.println("---------------회원 정보 출력---------------");
		System.out.printf("%s %s %5s %22s\n", "회원번호", "회원이름", "전화번호", "빌린 책(번호,이름,분류,내용)");
	}

	public void print() {
		System.out.printf("%3d %8s %15s\t", no, name, phone);
		book.print();
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}