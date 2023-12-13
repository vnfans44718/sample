package com.itwill.shop;

public class Order {

	int orderNo;
	String orderDate;
	int orderPrice;
	String orderAddress;

	public void orderInfo(int orderNo, String orderDate, int orderPrice, String orderAddress) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderPrice = orderPrice;
		this.orderAddress = orderAddress;
	}

	public void print() {
		System.out.println("주문번호   주문날짜   주문금액   주문주소");
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public void orderPrint() {
		System.out.printf("%5d %14s %8d %7s\n", getOrderNo(), getOrderDate(), getOrderPrice(), getOrderAddress());
	}

}
