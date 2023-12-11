
public class ForGugudan {
	
	public static void main(String[] args) {
		
		System.out.println("----------------출력형식-----------------");
		
		for(int i=1; i<10; i++) {
			for (int j=2; j<10; j++) {
				System.out.printf("%d*%d=%d\t ",j,i,i*j);
			}
			System.out.println(" ");
		}
		System.out.println("-----------------------------------------");
	} 

}