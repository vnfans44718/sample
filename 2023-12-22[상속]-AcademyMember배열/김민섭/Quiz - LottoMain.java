package lang;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("-----------------로또번호 6개생성[중복번호 허용안됨]-----------------");
		int[] lottoNumber = { 0, 0, 0, 0, 0, 0 };
		int temp = 0;
		/*
		 * 번호생성
		 * 	- Quiz : 중복체크
		 */

		for (int i = 0; i < lottoNumber.length; i++) {
			temp = (int) (Math.random() * 45) + 1;
			if (temp == lottoNumber[0]) {
				i--;
			} else if (temp == lottoNumber[1]) {
				i--;
			} else if (temp == lottoNumber[2]) {
				i--;
			} else if (temp == lottoNumber[3]) {
				i--;
			} else if (temp == lottoNumber[4]) {
				i--;
			} else if (temp == lottoNumber[5]) {
				i--;
			} else {
				lottoNumber[i] = temp;
			}

		}

		/*
		 * 번호출력
		 */
		for (int i = 0; i < lottoNumber.length; i++) {

			for (int j = 0; j < lottoNumber.length - 1 - i; j++) {
				if (lottoNumber[j] > lottoNumber[j + 1]) {
					temp = lottoNumber[j];
					lottoNumber[j] = lottoNumber[j + 1];
					lottoNumber[j + 1] = temp;

				}
			}
		}
		for (int no : lottoNumber) {
			System.out.println(no + " ");
		}
	}

}
