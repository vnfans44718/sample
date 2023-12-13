package com.itwill.shop;

public class Cart {
	// 상품이름 배송정보 수량 가격 합계
	private String product;
	private String infoDe;
	private int no;
	private int price;
	private int tot;

	public void info(String product, String infoDe, int no, int price) {
		this.product = product;
		this.infoDe = infoDe;
		this.no = no;
		this.price = price;

	}

	public void infoTot(int tot) {
		this.tot = tot;
	}

	public void headerPrint() {
		System.out.println("---------------------------------------------");
		System.out.printf("%s %8s %5s %5s \n", "상품이름", "배송정보", "수량", "가격");
		System.out.println("---------------------------------------------");
	}

	public void print() {
		System.out.printf("%s %8s %3d %8d\n ", this.product, this.infoDe, this.no, this.price);
	}

	public void printTot() {
		System.out.printf("\n합계 : %d", this.tot);
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getInfoDe() {
		return infoDe;
	}

	public void setInfoDe(String infoDe) {
		this.infoDe = infoDe;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

}
