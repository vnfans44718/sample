package object.modeling;

public class Cart {

	Member member;
	Product product;
	int amount;
	int totalPrice;

	public Cart(Member member, Product product, int amount) {
		this.member = member;
		this.product = product;
		this.amount = amount;
		this.totalPrice = product.getPrice() * amount;
	}

	String arrivalDate = "2023-12-15";

	void showInfoAll() {
		System.out.println("----------------------" + member.getName() + "님의 장바구니-----------------------");
		System.out.printf("%s %8s %8s %8s %8s %8s %n", "상품번호", "상품이름", "상품정보", "상품가격", "주문수량", "총가격");
		System.out.printf("--------------------------------------------------------%n");
		System.out.printf("%d %10s %13s %6d %6d %10d %n", product.getNo(), product.getTitle(), product.getInfo(),
				product.getPrice(), amount, product.getPrice() * amount);
		System.out.println();

		System.out.println("-----------------------배송 정보---------------------------");
		System.out.println("주문자 : " + member.getName() + "\t \t" + "주문자 전화번호 : " + member.getPhoneNumber());
		System.out.println("주소 : " + member.getAddress() + "\t\t" + "배송 예정일 : " + arrivalDate);
		System.out.println();

	}

	public Member getMember() {
		return member;
	}

	public Product getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

}