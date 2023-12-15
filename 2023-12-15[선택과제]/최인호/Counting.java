public class Counting {

	public static void main(String[] args) {

		int[] people = { 55, 40, 27, 99, 76, 81, 29, 31, 33, 62 };
		int[] ages = new int[10];

		for (int i = 0; i < people.length; i++) {
			if (people[i] >= 20 && people[i] < 30) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 30 && people[i] < 40) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 40 && people[i] < 50) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 50 && people[i] < 60) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 60 && people[i] < 70) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 70 && people[i] < 80) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 80 && people[i] < 90) {
				ages[people[i] / 10]++;
			} else if (people[i] >= 90 && people[i] < 100) {
				ages[people[i] / 10]++;
			}
		}

		for (int i = 0; i < ages.length - 2; i++) {
			System.out.printf("%d명 중 %d대는 %d명 입니다.\n", people.length, (i + 2) * 10, ages[i + 2]);
		}
	}
}