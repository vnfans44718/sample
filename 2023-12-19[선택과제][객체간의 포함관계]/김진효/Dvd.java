package itwill1103.포함;

public class Dvd {

	// 캡슐화
	// <<속성>> 번호, 타이틀, 쟝르
	private int no;
	private String title;
	private String genre;

	// 생성자를 정의하세요
	public Dvd() {
	}

	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}

	// 기능 DVD 정보 출력
	public void print() {
		System.out.println(" << DVD 정보 >>");
		System.out.println("번호: " + no);
		System.out.println("타이틀: " + title);
		System.out.println("장르: " + genre);
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}