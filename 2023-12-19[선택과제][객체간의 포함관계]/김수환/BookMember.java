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
	private String phoneNumber;
	private Book book;
	public BookMember() {
		
	}
	public BookMember(int no, String name, String phoneNumber, Book book) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.book = book;
	}
	public static void headPrint() {
		System.out.println("회원번호\t회원이름\t전화번호\t빌린책");
	}
	
	public void print() {
		System.out.print(no+"\t\t"+name+"\t\t"+phoneNumber+"\t");
		book.headPrint();
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	
	
	
	
	
}