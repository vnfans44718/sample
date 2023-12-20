package com.itwill03.포함.배열포함;


public class BookMember {
	private int no;					// 회원번호
	private String name;			// 회원이름
	private String phoneNumber;		// 전화번호
	private Book[] books;			// 빌린책들 
	
	public BookMember() {
		
	}
	
	public BookMember(int no, String name, String phoneNumber, Book[] books) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.books = books;
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
	
	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void print() {
		System.out.printf("회원번호: %-8d 회원이름: %-8s 전화번호: %-8s%n", no, name, phoneNumber);
	}
	
}
