package com.itwii.shop;

public class Product {
	int no;
	String title;
	int price;
	String info;

	// 상품 객체에 멤버변수를 대입하기 위한 메소드

	// 상품번호, 상품이름, 상품가격, 상품정보

	public void product(int no, String title, int price, String info) {
		this.no = no;
		this.title = title;
		this.price = price;
		this.info = info;
	}

	// 출력 메소드
	public void Print() {
		System.out.printf("상품번호: %d%n", no);
		System.out.printf("상품이름: %s%n", title);
		System.out.printf("상품가격: %d%n", price);
		System.out.printf("상품정보: %s%n", info);
		System.out.println();
	};

	public void productPrint() {
		System.out.printf("");
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}