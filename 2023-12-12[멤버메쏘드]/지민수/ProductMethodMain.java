package com.itwill01.method;

public class ProductMethodMain {

	public static void main(String[] args) {
		Product pro = new Product();
		
		pro.product("SSG 옥중 한딸기 500g", "국내산",4, 15874, 3, 13000, "500g");
		pro.tot();
		pro.st();
		pro.headerPrint();
		pro.Print();
		
		
		
	}

}
