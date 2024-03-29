package com.itwii.shop;

public class ShoppingMallMain {

	public static void main(String[] args) {
		/*
		 * 객체들생성
		 */
		Member member = new Member();
		Product product = new Product();
		Cart cart = new Cart();
		Order order = new Order();

		/*
		 * 객체들정보출력
		 */
		member.member("01012345678", "JANE", "서울특별시 강남구 역삼동");
		product.product(234522, "피코크 밀푀유나베", 11880, "\"보기도 좋고 먹기도 좋은 전골요리, 밀푀유나베\"");
		cart.cart("2023-06-11");
		order.order(1);

		cart.setCart(member, product, order);
		order.setOrder(product, member);

		// 계산 메소드 호출
		order.calTotalPrice();

		cart.headerPrint("회원");
		member.Print();
		cart.headerPrint("상품");
		product.Print();
		cart.headerPrint("주문");
		order.Print();

		cart.showInfoAll();
	}

}