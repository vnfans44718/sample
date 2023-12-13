package com.itwill.shop;

public class Product {

	private String img;
	private int no;
	private String name;
	private int price;
	private String store;

	public void myProduct(String img, int no, String name, int price, String store) {
		this.img = img;
		this.no = no;
		this.name = name;
		this.price = price;
		this.store = store;

	}

	public void headerPrint() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%s %6s %35s %43s %10s \n", "상품이미지", "상품번호", "상품명", "상품가격", "제조사");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");

	}
	
	public void print() {
		System.out.printf("%s %8d %43s %13d %12s \n", img, no, name, price, store);
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

}
