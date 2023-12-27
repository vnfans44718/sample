package com.itwill05.serivce.account;
public class AccountServiceReturnMain {
	public static void main(String[] args) {
		
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		
		System.out.println("0.AccountServiceReturn객체야 은행계좌객체 인자로줄게 추가해줘");
		accountServiceReturn.addAccount(1112,"JAN",10000, 1.0);
		accountServiceReturn.print();
		
		System.out.println("0.AccountServiceReturn객체야 번호,이름,잔고,이율줄게 추가해줘");
		accountServiceReturn.addAccount(new Account(1113, "HON", 89890, 8.9));
		accountServiceReturn.print();
		
		System.out.println("1.AccountServiceReturn객체야 은행계좌 총계좌수 반환해줘");
		int totAccountNumber=accountServiceReturn.getTotAccountNumber();
		System.out.println(">>은행 총계좌수:" + totAccountNumber);
		
		System.out.println("2.AccountServiceReturn객체야 은행계좌들 전체출력해줘");
		accountServiceReturn.print();
		
		System.out.println("3.AccountServiceReturn객체야 은행계좌들 총잔고 반환해줘");
		int totBalance = accountServiceReturn.getAccountTotBalance();
		System.out.println(">>은행 총계좌잔고:" + totBalance);
		
		System.out.println("4.AccountServiceReturn객체야 계좌번호인자로줄게 계좌한개참조변수 반환해줘");
		Account findAccount = accountServiceReturn.findByNo(1111);
		if(findAccount != null) {
			findAccount.print();
		}else {
			System.out.println("계좌 정보가 없습니다");
		}
		findAccount = accountServiceReturn.findByNo(1234);
		if(findAccount != null) {
			findAccount.print();
		}else {
			System.out.println("계좌 정보가 없습니다");
		}
		
		System.out.println("5.AccountServiceReturn객체야 계좌잔고인자로줄게 잔고이상인 계좌객체배열 참조변수반환해줘");
		Account[] findbyBal = accountServiceReturn.findByBalance(77000);
		for (Account account : findbyBal) {
			account.print();
		}
		
		System.out.println("6.AccountServiceReturn객체야 계좌이율(5.0) 인자로줄게 이율이상인 계좌객체배열 참조변수 반환해줘");
		Account[] findbyIyul = accountServiceReturn.findByIyul(5.0);
		for (Account account : findbyIyul) {
			account.print();
		}
		
		System.out.println("7.AccountServiceReturn객체야 계좌주이름(AIM) 인자로줄께 계좌객체배열 참조변수 반환해줘");
		Account[] findbyName = accountServiceReturn.findByName("AIM");
		for (Account account : findbyName) {
			account.print();
		}
		
		System.out.println("8.AccountServiceReturn객체야 계좌번호(6666번),입금할돈(4000원)줄게 입금해줘");
		Account ipgumAccount = accountServiceReturn.ipGum(6666, 4000);
		if (ipgumAccount != null) {
			ipgumAccount.print();
		}else {
			System.out.println("계좌 정보가 없습니다");
		}
		
		System.out.println("9.AccountServiceReturn객체야 계좌번호(1111번),출금할돈(500원)줄께 출금해줘");
		Account chulgumAccount = accountServiceReturn.chulGum(1111, 500);
		if (chulgumAccount != null) {
			chulgumAccount.print();
		}else {
			System.out.println("계좌 정보가 없습니다");
		}
		
		System.out.println("10.AccountServiceReturn객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceReturn.sort(3, 1);
		accountServiceReturn.print();
		
		System.out.println("11.AccountServiceReturn객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceReturn.sort(3, 2);
		accountServiceReturn.print();
		
		System.out.println("12.AccountServiceReturn야 계좌객체줄게 이름,잔고,이율 수정(update)해줘");
		Account temp1 = new Account(2222, "Orora", 66666, 6.6);
		accountServiceReturn.updateAccount(temp1);
		accountServiceReturn.print();
		
		System.out.println("13.AccountServiceReturn야 계좌데이터줄게 이름,잔고,이율 수정(update)해줘");
		accountServiceReturn.updateAccount(4444, "Bell", 99999, 9.9);
		accountServiceReturn.print();
		
		System.out.println("14.AccountServiceReturn객체야 계좌번호줄게 계좌삭제한후 삭제한계좌객체 반환해줘 [OPTION]");
		Account deleteAccount = accountServiceReturn.deleteByNo(5555);
		deleteAccount.print();
	}

}