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
	private Book[] books = new Book[3];

	public BookMember() {
		// TODO Auto-generated constructor stub
	}

	public BookMember(int memberNo, String memberName, int memberPhoneNumber) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public BookMember(int memberNo, String memberName, int memberPhoneNumber, Book[] book) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
		this.books = book;

	}

	public static void headPrint() {
		System.out.println(" <<< 회원번호 회원이름 전화번호 빌린책 >>>");
	}

	public void print() {
		System.out.printf(" %10d, %5s, %5d,   \n", memberNo, memberName, memberPhoneNumber);

		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] != null) {
				this.books[i].print();
			}
			if (i == this.books.length - 1 && this.books[i] != null) {
				System.out.println("\t\t*최대 도서대출 수량입니다.*");
			}
		}
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

	public Book[] getBook() {
		return books;
	}

	public void setBook(Book[] ibooks) {

		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] != null) {
				continue;
			} else {
//				System.out.println(this.books[0]);
//				System.out.println(this.books.length);
				this.books[i] = ibooks[0];
				break;

			}
		}
	}

}
