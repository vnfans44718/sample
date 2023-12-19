package object.modeling;

public class Member {
	private int no;
	private String name;
	private String address;
	private String phoneNumber;

	public Member(int no, String name, String address, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void print() {
		System.out.println("------------------------회원정보---------------------------");
		System.out.printf("%10s %10s %10s %10s\n", "회원번호", "이름", "주소", "연락처");
		System.out.printf("%10s %10s %10s %15s\n", no, name, address, phoneNumber);
		System.out.println("--------------------------------------------------------");

	}
}