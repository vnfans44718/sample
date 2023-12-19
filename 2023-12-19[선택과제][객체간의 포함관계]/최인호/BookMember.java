package com_12_19;

public class BookMember {

	private int no;
	private String name;
	private String phoneNumber;
	private Book[] book;

	public BookMember(int no, String name, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void print() {
		System.out.print("회원번호 : " + no + "  회원이름 : " + name + "  전화번호 : " + phoneNumber + "  빌린책 : ");
		for (int i = 0; i < book.length; i++) {
			System.out.print("[" + book[i].getTitle() + "]");
		}
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

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

}