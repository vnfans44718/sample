package com.itwill.shop;

public class ShoppingMallMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.myInfo(1, "김미진", "abc@naver.com", "010-1234-5678", "경기도 용인시");

		Product product = new Product();
		product.myProduct("케이크.jpg", 1225, "(예약발송) 메리크리스마스 산타와 루돌프의 하루 2단 케이크 만들기 세트", 37000, "지니마스");

		Cart cart = new Cart();
		cart.myCart("케이크.jpg", 1225, "(예약발송) 메리크리스마스 산타와 루돌프의 하루 2단 케이크 만들기 세트", "지니마스", 37000, 3500, 1,
				"12월 23일 도착예정");

		Order order = new Order();
		order.myOrder("김미진", "010-1234-5678", "경기도 용인시", "케이크.jpg", 1225, "(예약발송) 메리크리스마스 산타와 루돌프의 하루 2단 케이크 만들기 세트",
				"지니마스", 1, 37000, 3500, "12월 23일 도착예정", 37000, 3500, 0, 37000);

		
		System.out.println(">> 회원정보");
		member.headerPrint();
		member.print();
		System.out.println();
		System.out.println(">> 제품정보");
		product.headerPrint();
		product.print();
		System.out.println();
		System.out.println(">> 장바구니");
		cart.headerPrint();
		cart.print();
		System.out.println();
		System.out.println(">> 주문정보");
		order.headerPrint();
		order.print();

	}

}
