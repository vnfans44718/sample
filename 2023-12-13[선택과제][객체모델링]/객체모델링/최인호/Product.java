package object.modeling;

public class Product {

	private int no;
	private String title;
	private int price;
	private String info;

	public Product(int no, String title, int price, String info) {
		this.no = no;
		this.title = title;
		this.price = price;
		this.info = info;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void print() {
		System.out.println("------------------------상품정보---------------------------");
		System.out.printf("%10s %10s %10s %10s\n", "상품번호", "상품이름", "상품가격", "상품설명");
		System.out.printf("%10s %10s %10s %15s\n", no, title, price, info);
		System.out.println("--------------------------------------------------------");

	}
}