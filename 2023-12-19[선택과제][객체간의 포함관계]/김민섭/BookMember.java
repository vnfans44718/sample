package com.포함;

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

	private int memberNo;
	private String memberName;
	private int memberPhoneNumber;
	private Book book;

	public BookMember() {
		// TODO Auto-generated constructor stub
	}

	public BookMember(int memberNo, String memberName, int memberPhoneNumber) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public BookMember(int memberNo, String memberName, int memberPhoneNumber, Book book) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
		this.book = book;
	}

	public static void headPrint() {
		System.out.println(" <<< 회원번호 회원이름 전화번호 빌린책 >>>");
	}

	public void print() {
		System.out.printf(" %10d, %5s, %5d,   \n", memberNo, memberName, memberPhoneNumber);
		book.headPrint();
		book.print();

	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberPhoneNumber() {
		return memberPhoneNumber;
	}

	public void setMemberPhoneNumber(int memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
