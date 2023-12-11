package com.itwill00.variable;

public class ForStar {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%s[%d,%d]", "★", i, j);
			}
			System.out.print("\n");
		}

		System.out.println("---------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		System.out.println("---------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		System.out.println("---------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= j) {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("---------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i > j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
	}

}
