package com.itwii.shop;

public class Order {
	int amount;
	int totalPrice;
	Product product = new Product();

	// 주문 객체를 멤버변수에 대입하기 위한 메소드
	// 주문 총 수량
	public void order(int amount) {
		this.amount = amount;
	}

	// 주문 총 가격 계산 메소드
	public void calTotalPrice() {
		totalPrice = (product.getPrice() * this.amount);
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
