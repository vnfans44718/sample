package object.modeling;

public class Order {
	private int orderNumber;
	private String orderDate;
	private int orderPrice;
	private String orderAddress;

	public Order(int orderNumber, String orderDate, int orderPrice, String orderAddress) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderPrice = orderPrice;
		this.orderAddress = orderAddress;
	}

	public void print() {
		System.out.printf("주문번호 : %d, 주문날짜 : %s, 주문가격 : %d, 배송지 : %s", orderNumber, orderDate, orderPrice,
				orderAddress);
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public String getOrderAddress() {
		return orderAddress;
	}
}
