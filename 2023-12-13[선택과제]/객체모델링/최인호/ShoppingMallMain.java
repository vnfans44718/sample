package object.modeling;

public class ShoppingMallMain {

	public static void main(String[] args) {

		Member member1 = new Member(1, "최인호", "일산서구", "010-1234-5678");
		Product product1 = new Product(1, "딸기", 13000, "개꿀맛 딸기입니다.");
		Cart cart = new Cart(member1, product1, 3);

		Order order = new Order(1, "2023-12-13", cart.getTotalPrice(), member1.getAddress());
		member1.print();
		product1.print();

		cart.showInfoAll();
		order.print();
	}

}