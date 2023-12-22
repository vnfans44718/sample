package itwill1103.포함.배열포함;

public class DvdMember {
	private int no;// 회원번호
	private String name;// 회원이름
	private String tel;// 전화번호
	private Dvd[] dvds;// 빌린dvd들[최대3개]

	public DvdMember() {
		dvds = new Dvd[3];
	}

	public void rentDVD(Dvd dvd1, Dvd dvd2, Dvd dvd3) {
		this.dvds[0] = dvd1;
		this.dvds[1] = dvd2;
		this.dvds[2] = dvd3;
	}

	public void rentDVD(Dvd dvd1, Dvd dvd2) {
		this.dvds[0] = dvd1;
		this.dvds[1] = dvd2;
	}

	public void rentDVD(Dvd dvd1) {
		this.dvds[0] = dvd1;
	}

	public DvdMember(int no, String name, String tel, Dvd[] dvds) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.dvds = dvds;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public static void headerPrint() {
		System.out.println("<< 회원정보출력 >>");
	}

	public void print() {
		System.out.println(no + "\t" + name + "\t" + tel + "\t");
		DvdMember.headerPrint();
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] != null) {
				dvds[i].print();
			}
		}
	}
}
