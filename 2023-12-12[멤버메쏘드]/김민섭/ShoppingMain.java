package com.itwill01.Method;

public class ShoppingMain {

	public static void main(String[] args) {
		Shopping shop1 = new Shopping();
		Shopping shop2 = new Shopping();
		Shopping shop3 = new Shopping();
		Shopping shop4 = new Shopping();
		shop1.want("SSG", "김딸기", "옥종한단딸기", 4.7, "국산", 20, 13900, 3, "한국", 3);
		shop2.want("신세계", "김고구마", "따뜻한 군고구마", 3.9, "국산", 70, 30000, 5, "한국", 1);
		shop3.want("옥션", "김감자", "맛있는 감자", 3.3, "국산", 30, 25000, 2, "한국", 2);
		shop4.want("쿠팡", "김자반", "밥도둑 김자반", 4.1, "국산", 10, 9900, 2, "한국", 5);
		shop1.print();
		shop2.print();
		shop3.print();
		shop4.print();
	}

}
