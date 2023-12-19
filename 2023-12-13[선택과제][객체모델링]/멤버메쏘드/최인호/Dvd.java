package member.method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	 * 
	 * <<기능>>
	 *   - Dvd정보대입
	 *   - Dvd정보출력
	 *   
	 */
	private int dvdNumber;
	private String dvdTitle;
	private String genre;

	public Dvd(int dvdNumber, String dvdTitle, String genre) {
		super();
		this.dvdNumber = dvdNumber;
		this.dvdTitle = dvdTitle;
		this.genre = genre;
	}

	public int getDvdNumber() {
		return dvdNumber;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public String getGenre() {
		return genre;
	}

	public void print() {
		System.out.printf("DVD 정보 -> 번호: %d, 제목: %s, 장르: %s\n", dvdNumber, dvdTitle, genre);
	}

}