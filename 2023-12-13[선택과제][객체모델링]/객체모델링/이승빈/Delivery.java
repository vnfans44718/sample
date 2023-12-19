package com.itwill01.method;
/*
   >> [Option] 객체 구현 및 출력
      2. 음식점 배달 정보 객체 구현
 */
public class Delivery {

	// 멤버변수 선언(접수번호, 핸드폰번호, 집주소, 날짜, 시간, 가격, 메뉴번호)
	long orderNo;
	String orderHPNo;
	String orderAddress;
	int orderDate;
	int orderTime;
	int orderPrice;
	String menuNo;

	// 배달주문정보메쏘드 선언
	public void deliveryOrderInfo(long orderNo, String orderHPNo, String orderAddress, int orderDate, int orderTime,
			int orderPrice, String menuNo) {
		this.orderNo = orderNo;
		this.orderHPNo = orderHPNo;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNo = menuNo;
	}

	// 출력메쏘드 선언
	public void headerPrint() {
		System.out.printf("ㅇㅇ음식점에 배달 주문이 들어왔습니다.\n");
		System.out.println();
	}

	public void deliveryOrderPrint() {
		System.out.printf("주문 접수 번호: %d\n", this.orderNo);
		System.out.printf("주문 핸드폰 번호: %s\n", this.orderHPNo);
		System.out.printf("주문 집 주소: %s\n", this.orderAddress);
		System.out.printf("주문 날짜: %d\n", this.orderDate);
		System.out.printf("주문 시간: %d\n", this.orderTime);
		System.out.printf("주문 가격: %d\n", this.orderPrice);
		System.out.printf("메뉴 번호: %s\n", this.menuNo);
	}

}
