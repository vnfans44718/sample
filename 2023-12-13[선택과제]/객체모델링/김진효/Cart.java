package com.itwii.shop;

public class Cart {

	/*
	 * Product.java와 Member.java클래스의 정보를 공유해야함 
	 * 주문 번호, 주문 수량, 주문 날짜 결제 완료 유무,
	 * 상품 번호,상품 이름, 주문 수량
	 * 회원 이름 회원 번호
	 */

	/* 
	 * 배송 예정일만 따로 설정함.
	 */
	Member member;
	Product product;
	Order order;
	String arrivalDate = "2023-06-11";

	void setCart(Member member, Product product, Order order) {
		// Member, Product클래스를 cart클래스에서 참조할 수 있게 만드는 메서드.
		this.member = member;
		this.product = product;
		this.order = order;
	}

	void cart(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	void showInfoAll() { // 원하는 정보만 출력 가능하게끔.
		System.out.println("----------------------------------------" + member.getName()
				+ "님의 장바구니----------------------------------------------");
		System.out.printf("%s %7s \t\t%13s \t\t %10s %s %3s %n", "상품번호", "상품이름", "상품정보", "상품가격", "주문수량", "총가격");
		System.out.printf(
				"-------------------------------------------------------------------------------------------------------%n");
		System.out.printf("%d %4s %4s %5d %8d %7d %n", product.getNo(), product.getTitle(), product.getInfo(),
				product.getPrice(), order.getAmount(), order.getTotalPrice());
		System.out.println();

		System.out.println("--------------------배송 정보--------------------------");
		System.out.println("주문자 : " + member.getName() + "\t \t" + "주문자 전화번호 : " + member.getNo());
		System.out.println("주소 : " + member.getAddress() + "\t" + "배송 예정일 : " + arrivalDate);
		System.out.println();

	}

	public void headerPrint(String hp) {
		System.out.printf("\t <<%s 정보>> %n", hp);
		System.out.println("----------------------------------------------");
	}

}