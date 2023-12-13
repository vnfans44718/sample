package com.itwill.shop;

public class Product {
	// 상품번호 상품이름 상품가격
	private int no;
	private String title;
	private int price;

	public void info(int no, String title, int price) {
		this.no = no;
		this.title = title;
		this.price = price;
	}

	public void headerPrint() {
		System.out.println("---------------------------------------------");
		System.out.printf("%s %10s %10s\n", "상품번호", "상품이름", "상품가격");
		System.out.println("---------------------------------------------");
	}

	public void print() {
		System.out.printf("%5d %13s %13d\n", this.no, this.title, this.price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
