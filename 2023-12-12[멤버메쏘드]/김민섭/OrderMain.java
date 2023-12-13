package com.itwill01.Method;

public class OrderMain {

//	주문 접수 번호 : 202011020003
//	주문 핸드폰 번호 : 01023450001
//	주문 집 주소 : 서울시 강남구 역삼동 111-333
//	주문 날짜 : 20201102
//	주문 시간 : 130258
//	주문 가격 : 35000
//	메뉴 번호 : 0003

	public static void main(String[] args) {

		Order order = new Order();

		order.order1(202011020003L, "01012345678", "서울시 어딘가", 20201102, 130258, 35000, 0003);

	}

}
