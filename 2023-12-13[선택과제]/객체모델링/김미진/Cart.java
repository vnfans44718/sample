package com.itwill.shop;

public class Cart {

	private String img;
	private int no;
	private String name;
	private String store;
	private int price;
	private int delivery;
	private int quantity;
	private String arrival;

	public void myCart(String img, int no, String name, String store, int price, int delivery, int quantity,
			String arrival) {
		this.img = img;
		this.no = no;
		this.name = name;
		this.store = store;
		this.price = price;
		this.delivery = delivery;
		this.quantity = quantity;
		this.arrival = arrival;
	}

	public void headerPrint() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%s %6s %40s %34s %8s %8s %6s %12s \n", "상품이미지", "상품번호", "상품명", "제조사", "상품가격", "배송비", "수량", "도착예정일");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void print() {
		System.out.printf("%s %8d %44s %7s %9d %12d %7d %17s \n", img, no, name, store, price, delivery, quantity, arrival);
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

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

}