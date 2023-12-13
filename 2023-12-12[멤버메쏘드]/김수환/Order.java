package com.itwill01.method;

public class Order {
	/*
	주문 접수 번호 : 202011020003
	주문 핸드폰 번호 : 01023450001
	주문 집 주소 : 서울시 강남구 역삼동 111-333
	주문 날짜 : 20201102
	주문 시간 : 130258
	주문 가격 : 35000
	메뉴 번호 : 0003
	*/
	int ordernum;
	int phon;
	String home;
	int orderdate;
	int time;
	int price;
	int menuNum;

	public void orderRist(int ordernum, int phon, String home, int orderdate, int time, int price, int menuNum) {
		this.ordernum = ordernum;
		this.phon = phon;
		this.home = home;
		this.orderdate = orderdate;
		this.time = time;
		this.price = price;
		this.menuNum = menuNum;
	}

	public void headPrint() {
		System.out.print("주문 접수 번호 : " + this.ordernum + "\n주문 핸드폰 번호 : " + this.phon + "\n주문 집 주소 : " + this.home
				+ "\n주문 날짜 : " + this.orderdate + "\n주문 시간 : " + this.time + "\n주문 가격 : " + this.price + "\n메뉴 번호 : "
				+ this.menuNum);

	}
}
