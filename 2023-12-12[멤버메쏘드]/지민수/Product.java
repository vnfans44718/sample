package com.itwill01.method;

public class Product {

	String name, origin, grade,unit;

	int quanity, price, tot,  review, star;

	public void product(String name, String origin, int star, int review, int quanity, int price, String unit) {
		this.name = name;
		this.origin = origin;
		this.review = review;
		this.quanity = quanity;
		this.price = price;
		this.unit = unit;
		
		this.star = star;
	}
	public void tot() {
		this.tot = quanity*price;
	}
	
	
	
	public void st() {
		if (this.star == 1) {
			this.grade = "★";
		}
		if (this.star == 2) {
			this.grade = "★★";
		}
		if (this.star == 3) {
			this.grade = "★★★";
		}
		if (this.star == 4) {
			this.grade = "★★★★";
		}
		if (this.star == 5) {
			this.grade = "★★★★★★";
		}

	}

	public void headerPrint() {
		System.out.println("------------제품 정보-------------");
	}

	public void Print() {
		System.out.println("상품 이름 : "+this.name);
		System.out.println("원산지 : "+this.origin);
		System.out.println("별점 : "+this.grade);
		System.out.println("리뷰 갯수 : "+this.review);
		System.out.println("수량 : "+this.quanity);
		System.out.println("가격 : "+this.price);
		System.out.println("단위 : "+this.unit);
		System.out.println("합계 : "+this.tot);
	}
}
