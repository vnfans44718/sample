

public class HealthMain {
	public static void main(String[] args) {
		Health people=new Health();
		Health people2=new Health();
		
		people.data(180, 80, "남성", "김수환", 32, "PT");
		people2.data(160, 50, "여성", "김수환", 22, "요가");
		
		people.print();
		people2.print();
		
	}
}