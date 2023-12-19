package com.itwill.shop;

public class Order {

	private String name1;
	private String num;
	private String address;
	private String img;
	private int no;
	private String name2;
	private String store;
	private int quantity;
	private int price;
	private int delivery;
	private String arrival;
	private int extendedPrice;
	private int totDelivery;
	private int discount;
	private int totPrice;

	public void myOrder(String name1, String num, String address, String img, int no, String name2, String store,
			int quantity, int price, int delivery, String arrival, int extendedPrice, int totDelivery, int discount,
			int totPrice) {

		this.name1 = name1;
		this.num = num;
		this.address = address;
		this.img = img;
		this.no = no;
		this.name2 = name2;
		this.store = store;
		this.quantity = quantity;
		this.price = price;
		this.delivery = delivery;
		this.arrival = arrival;
		this.extendedPrice = extendedPrice;
		this.totDelivery = totDelivery;
		this.discount = discount;
		this.totPrice = totPrice;
	}

	public void headerPrint() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%s %8s %10s %10s %8s %38s %40s %5s %5s %5s %11s %13s %5s %7s %9s \n", "수령인", "전화번호", "배송지", "상품이미지", "주문번호",
				"주문상품", "제조사", "수량", "가격", "배송비", "도착예정일", "선택상품가격", "총배송비", "할인금액", "총결제금액");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public void print() {
		System.out.printf("%s %14s %8s %10s %9d %44s %11s %5d %9d %6d %15s %11d %11d %9d %16d \n", name1, num, address, img, no, name2,
				store, quantity, price, delivery, arrival, extendedPrice, totDelivery, discount, totPrice);
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getExtendedPrice() {
		return extendedPrice;
	}

	public void setExtendedPrice(int extendedPrice) {
		this.extendedPrice = extendedPrice;
	}

	public int getTotDelivery() {
		return totDelivery;
	}

	public void setTotDelivery(int totDelivery) {
		this.totDelivery = totDelivery;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(int totPrice) {
		this.totPrice = totPrice;
	}

}