package com.itwill01.method;

public class Delivery {

	long orderNo;
	int number;
	String address;
	int day;
	int time;
	int price;
	String menuNo;
	
	public void data(long orderNo,int number,String address,int day,int time,int price,String menuNo) {
		this.orderNo=orderNo;
		this.number=number;
		this.address=address;
		this.day=day;
		this.time=time;
		this.price=price;
		this.menuNo=menuNo;
	
	}
	public void print() {
		System.out.printf("주문 접수번호:"+"%d\n"
				        + "주문 핸드폰 번호:"+"%d\n"
						+ "주문 집 주소:"+"%s\n"
						+ "주문 날짜:"+"%d\n"
						+ "주문 시간:"+"%d\n"
						+ "주문 가격:"+"%d\n"
						+ "메뉴 번호:"+"%s\n",
				this.orderNo,this.number,this.address,this.day,this.time,this.price,this.menuNo);
	}
	
}
