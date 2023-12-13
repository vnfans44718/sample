package com.itwill01.method;

public class Delivery {
	int  phoneNo, date, time, price, menuNo; 
	long orderNo;
	String address;
	
	public void info(long orderNo, int phoneNo, String address, int date, int time, int price, int menuNo) {
		this.orderNo = orderNo;
		this.phoneNo = phoneNo;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNo = menuNo;
	}
	
	public void Print() {
		System.out.println("주문 접수 번호 : "+orderNo);
		System.out.println("주문 핸드폰 번호 : "+phoneNo);
		System.out.println("주문 집 주소 : "+address);
		System.out.println("주문 날짜 : "+date);
		System.out.println("주문 시간 : "+time);
		System.out.println("주문 가격 : "+price);
		System.out.println("메뉴 번호 : "+menuNo);
	}
	
}
