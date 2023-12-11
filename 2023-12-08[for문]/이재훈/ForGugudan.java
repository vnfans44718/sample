
public class ForGugudan {
	
	public static void main(String[] args) {
		
		System.out.println("----------------출력형식----------------");
		int i=1;
		while(i<=9) {
			int j=2;
			while(j<=9) {
				System.out.printf("%d*%d=%d ",j,i,i*j);
				j++;
			}
			System.out.println("\n");
			i++;
		}
		System.out.println("-----------------------------------------");
}
}