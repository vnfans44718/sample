
public class ShoppingCartMain {

	public static void main(String[] args) {

		ShoppingCart cartPrdt1 = new ShoppingCart();

		cartPrdt1.setData("옥송한단딸기", 500, 12239, 36, 21900, 1, "국내산");

		cartPrdt1.discountP();
		cartPrdt1.Ptotal();
		cartPrdt1.prtGrd();
		cartPrdt1.headerPrint();
		cartPrdt1.print();

	}

}
