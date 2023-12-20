package itwill1103.포함.배열포함;

public class Book {
	private int no; // 책번호
	private String title; // 책제목
	private String category; // 책분류
	private String desc; // 책설명

	public Book() {
	}

	public Book(int no, String title, String category, String desc) {
		super();
		this.no = no;
		this.title = title;
		this.category = category;
		this.desc = desc;
	}

	public static void headerPrint() {
		System.out.println("\t" + "<< 책정보출력 >>");
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void print() {
		System.out.println("\t" + no + "\t" + title + "\t" + category + "\t" + desc + "\t");

	}

}