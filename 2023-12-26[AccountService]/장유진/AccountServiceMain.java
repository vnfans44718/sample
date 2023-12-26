package com.itwill05.service.array.account;

public class AccountServiceMain {
	
	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		/*
		<<과제아님>>
		System.out.println("0.AccountService객체야 Account추가(배열사이즈증가)[OPTION]");
		*/
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();
		
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountService.print();
		
		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");
		accountService.balancePrint();
		
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");
		accountService.findByNoPrint(3333);
		accountService.findByNoPrint(7777);
		
		System.out.println("5.AccountService객체야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		accountService.findByBalancePrint(50000);
		
		System.out.println("6.AccountService객체야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		accountService.findByIyulPrint(3.3);
		
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		accountService.findByNamePrint("KIM");
		
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.ipGum(5555, 12300);
		accountService.ipGum(8888, 54300);
		
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.chulGum(4444, 15450);
		accountService.chulGum(2222, 4500);
		
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountService.sortByBalanceAsc();
		accountService.print();
		
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountService.sortByBalanceDesc();
		accountService.print();
		
		
		/*
		<<과제아님>>
		accountService.sort(AccountService.SORT_BY_NO, AccountService.SORT_ASC);
		*/
		
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		Account account = accountService.findByNo(1111);
		accountService.updateAccountData(account);
		accountService.print();
		
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘)[OPTION]");
		accountService.updateAccountData(1111, "PIN", 199000, 9.9);
		accountService.print();
	}
}