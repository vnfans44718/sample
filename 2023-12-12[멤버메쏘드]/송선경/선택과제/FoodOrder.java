
public class FoodOrder {

	// 필드 선언

	String no;
	String cellno;
	String address;
	String date;
	String time;
	int price;
	String mNo;

	// 메소드 선언

	// 주문정보 입력 메소드
	public void setData(String no, String cellno, String address, String date, String time, int price, String mNo) {

		this.no = no;
		this.cellno = cellno;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.mNo = mNo;

	}

	// 출력 메소드
	public void print() {
		System.out.println("주문 접수번호 : " + no);
		System.out.println("주문 핸드폰 번호 : " + cellno);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + mNo);

	}

}
