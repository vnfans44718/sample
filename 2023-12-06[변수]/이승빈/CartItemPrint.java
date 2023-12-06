
public class CartItemPrint {

	public static void main(String[] args) {
		String product;
		String type;
		int price;
		int qty;
		int total;
		double delivery;
		
		product = "구스털 빵빵한 겨울패딩";
		type = "의류";
		price = 125000;
		qty = 2;
		total = price * qty;
		delivery = 2.5;
		
		System.out.println("# 장바구니 LIST");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|               제품명               |   분류   |    가격    |  수량  |   총금액   |   딜리버리   |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("        "+product+"           "+type+"       "+price+"        "+qty+"       "+total+"        "+delivery+"일");
		System.out.println("---------------------------------------------------------------------------------------------------");

	}

}
