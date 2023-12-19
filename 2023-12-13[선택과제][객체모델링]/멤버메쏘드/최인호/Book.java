package member.method;

public class Book {

	private int bookNumber;
	private String bookName;
	private String bookType;
	private String bookInfo;

	public Book(int bookNumber, String bookName, String bookType, String bookInfo) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookInfo = bookInfo;
	}

	public void print() {
		System.out.printf("책번호 : %d  책이름 : %s  책분류 : %s  책정보 : %s\n", bookNumber, bookName, bookType, bookInfo);
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public String getBookInfo() {
		return bookInfo;
	}

}