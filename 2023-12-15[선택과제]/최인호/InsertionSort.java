
public class InsertionSort {

	public static void main(String[] args) {
		int[] datas = { 5, 4, 1, 3, 2 };

		for (int i = 1; i < datas.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = datas[i];
				if (temp < datas[j]) {
					datas[i] = datas[j];
					datas[j] = temp;

				}
			}
		}
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
	}

}
