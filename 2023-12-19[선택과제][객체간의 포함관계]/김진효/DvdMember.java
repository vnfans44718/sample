package itwill1103.포함;

public class DvdMember {
	// 캡슐화
	// <<속성>> 회원번호, 회원이름, 전화번호, 빌린dvd

	private int no;
	private String name;
	private String PhoneNum;
	private Dvd rentDvd; // 빌린dvd

	// 생성자 정의
	public DvdMember() {
	}

	public DvdMember(int no, String name, String phoneNum) {
		super();
		this.no = no;
		this.name = name;
		PhoneNum = phoneNum;
	}

	// <<기능>> 회원정보출력
	public void print() {
		System.out.println(" << 회원 정보 >>");
		System.out.println("회원번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + PhoneNum);
		System.out.println();
		rentDvd.print();
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

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

}