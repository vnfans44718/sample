package member.method;

public class BookLibraryMain {
	public static void main(String[] args) {

		Book b1[] = new Book[] { new Book(1, "백두산이 폭발한다!", "동화", "서바이벌 재난동화"),
				new Book(2, "고래와 대화하는 방법", "기초과학", "물속에 사는 우리 사촌들과 이야기하는 과학적인 방법"), new Book(3, "화산귀환1", "판타지",
						"천하를 혼란에 빠트린 고금 제일마, 천마의 목을 치고 숨을 거둔 매화검존. 백 년후에 거지꼴로 환생하게 되는데……?! 본도 청명, 다시 화산에 입문하다!") };

		b1[0].print();
		b1[1].print();
		b1[2].print();
	}
}