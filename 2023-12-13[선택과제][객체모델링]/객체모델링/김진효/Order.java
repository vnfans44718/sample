package com.itwii.shop;

public class Order {
	int amount;
	int totalPrice;
	Product product;
	Member member;

	void setOrder(Product product, Member member) {
		this.product = product;
		this.member = member;
	}

	// 주문 객체를 멤버변수에 대입하기 위한 메소드
	// 주문 총 수량
	public void order(int amount) {
		this.amount = amount;
	}

	// 주문 총 가격 계산 메소드
	public void calTotalPrice() {
		totalPrice = (product.getPrice() * amount);
	}

	// 출력메소드
	public void Print() {
		System.out.printf("주문자 이름: %s%n", member.getName());
		System.out.printf("주문자 전화번호: %s%n", member.getNo());
		System.out.printf("주문자 배송정보: %s%n", member.getAddress());
		System.out.printf("주문수량: %d%n", amount);
		System.out.printf("총가격: %d%n", totalPrice);
		System.out.println();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
