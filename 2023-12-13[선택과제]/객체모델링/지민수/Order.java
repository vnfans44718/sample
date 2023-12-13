package com.itwill.shop;

public class Order {
	/*
	 * 주문번호,주문날짜,주문금액,배송지
	 */
	private int no;
	private String date;
	private int price;
	private String address;

	public void info(int no, String date, int price, String address) {
		this.no = no;
		this.date = date;
		this.price = price;
		this.address = address;
	}

	public void headerPrint() {
		System.out.println("\n-------------------------------------------------------");
		System.out.printf("%s %10s %10s %10s \n", "주문번호", "주문날짜", "주문금액", "배송지");
		System.out.println("-------------------------------------------------------");
	}

	public void print() {
		System.out.printf("%5d %18s %13d %10s\n", this.no, this.date, this.price, this.address);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
