package com.itwill05.service.array;
public class AccountServiceMain {
	public static void main(String[] args) {
	
		AccountService account = new AccountService();
		
		System.out.println("0.AccountService객체야 Account 객체줄께추가해줘(배열사이즈증가)[OPTION]");
		Account leng1 = new Account(1234, "PPP", 40550, 3.3);
		account.addAccount(leng1);
		account.print();
		
		System.out.println("0.AccountService객체야 번호,이름,잔고,이율줄께 계좌객체추가해줘(배열사이즈증가)[OPTION]");
		
		account.addAccount(4567	, "KKK", 55666, 5.0);
		account.print();
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");
		account.totAccountNumberPrint();
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		account.print();
		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");
		account.totBalancePrint();
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");
		account.findByNoPrint(2222);
		
		
		
		
		System.out.println("5.AccountService객체야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		account.findByBalancePrint(60000);
		System.out.println("6.AccountService객체야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		account.findByIyulPrint(4);
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		account.findByNamePrint("KIM");
		
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");
		account.ipGum(1111, 3000);
		
		
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");
		account.chulGum(3333, 50000);
		
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		account.sortByBalanceAscending();
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		account.sortByBalanceDescending();
		/*
		<<과제아님>>
		accountService.sort(AccountService.SORT_BY_NO, AccountService.SORT_ASC);
		 */
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		Account update = new Account(3333, "FOX", 66666, 6.6);
		account.updateAccount(update);
		account.print();
		
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘)[OPTION]");
		account.updateAccount(1111, "OP", 7788, 1.1);
		account.print();
		
		
	}
}