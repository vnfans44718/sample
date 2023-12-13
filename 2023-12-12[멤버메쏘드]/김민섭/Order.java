package com.itwill01.Method;

public class Order {

//	주문 접수 번호 : 202011020003
//	주문 핸드폰 번호 : 01023450001
//	주문 집 주소 : 서울시 강남구 역삼동 111-333
//	주문 날짜 : 20201102
//	주문 시간 : 130258
//	주문 가격 : 35000
//	메뉴 번호 : 0003

	int date, time, price, menuNumber;
	String phoneNumber, address;
	long orderNumber;

	public void order1(long orderNumber, String phoneNumber, String address, int date, int time, int price,
			int menuNumber) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;

		System.out.printf("%s %d\n", "주문 접수 번호 : ", this.orderNumber);
		System.out.printf("%s %s\n", "주문 핸드폰 번호 : ", this.phoneNumber);
		System.out.printf("%s %s\n", "주문 집 주소 : ", this.address);
		System.out.printf("%s %d\n", "주문 날짜 : ", this.date);
		System.out.printf("%s %d\n", "주문 시간 : ", this.time);
		System.out.printf("%s %d\n", "주문 가격 : ", this.price);
		System.out.printf("%s %d\n", "메뉴 번호 : ", this.menuNumber);
	}

}
