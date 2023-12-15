public class GreedyTest {

	public static void main(String[] args) {

		int[] coins = { 500, 100, 50, 10 };
		int price = 8370;

		System.out.printf("500짜리 동전 %d개 가 필요합니다.\n", price / coins[0]);
		System.out.printf("100짜리 동전 %d개 가 필요합니다.\n", (price % coins[0]) / coins[1]);
		System.out.printf("50짜리 동전 %d개 가 필요합니다.\n", ((price % coins[0]) % coins[1]) / coins[2]);
		System.out.printf("10짜리 동전 %d개 가 필요합니다.\n", (((price % coins[0]) % coins[1]) % coins[2]) / coins[3]);

	}

}