package member.method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */

		/*
		 * Dvd정보대입메쏘드호출
		 */

		/*
		 * Dvd정보출력메쏘드호출
		 */
		Dvd d1 = new Dvd(1, "태극기 휘날리며", "드라마");
		Dvd d2 = new Dvd(2, "추격자", "스릴러");
		Dvd d3 = new Dvd(3, "컨저링", "공포");

		d1.print();
		d2.print();
		d3.print();
	}

}