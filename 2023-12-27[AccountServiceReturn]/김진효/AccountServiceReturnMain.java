package com.itwill05.service.array.account;

public class AccountServiceReturnMain {
	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		System.out.println("0.AccountServiceReturn객체야 은행계좌객체인자로줄께 추가해줘");
		accountServiceReturn.addAccount(1112, "JAN", 10000, 1.0);
		accountServiceReturn.addAccount(new Account(1113, "HON", 89890, 8.9));
		System.out.println("1.AccountServiceReturn객체야 은행계좌 총계좌수를 반환해줘");
		int totAccountNumber = accountServiceReturn.getTotAccountNumber();
		// System.out.println(">>은행총계좌수:" + totAccountNumber);
		System.out.println("2.AccountServiceReturn객체야 은행계좌들 전체출력해줘");
		accountServiceReturn.print();
		System.out.println("3.AccountServiceReturn객체야 은행계좌들 총잔고를 반환해줘");
		int totBalance = accountServiceReturn.getAccountTotBalance();
		System.out.println(">>은행총계좌잔고:" + totBalance);
		System.out.println("4.AccountServiceReturn객체야 계좌번호를인자로 넣어줄께 계좌한개참조변수를 반환해줘");
		Account findAccount = accountServiceReturn.findByNo(1111);
		findAccount.print();
		findAccount = accountServiceReturn.findByNo(1113);
		findAccount.print();
		System.out.println("5.AccountServiceReturn객체야 계좌잔고를 인자로줄께 잔고이상인 계좌객체배열 참조변수반환해줘");
		Account[] findAccountArray = accountServiceReturn.findByBalance(80000);
		for (int i = 0; i < findAccountArray.length; i++) {
			findAccountArray[i].print();
		}
		System.out.println("6.AccountServiceReturn객체야 계좌이율(5.0)을 인자로줄께 이율이상인 계좌객체배열 참조변수 반환해줘");
		Account[] findAccountIyulArray = accountServiceReturn.findByIyul(5.0);
		for (int i = 0; i < findAccountIyulArray.length; i++) {
			findAccountIyulArray[i].print();
		}
		System.out.println("7.AccountServiceReturn객체야 계좌주이름(AIM)을 인자로줄께 계좌객체배열 참조변수 반환해줘");
		Account[] findAccountsOwnerArray = accountServiceReturn.findByName("AIM");
		for (int i = 0; i < findAccountsOwnerArray.length; i++) {
			findAccountsOwnerArray[i].print();
		}
		System.out.println("8.AccountServiceReturn객체야 계좌번호(6666번)와 입금할돈(4000원)줄께 입금해줘");
		Account ipGumAccount = accountServiceReturn.ipGum(6666, 4000);
		ipGumAccount.print();
		System.out.println("9.AccountServiceReturn객체야 계좌번호(1111번)와 출금할돈(500원)줄께 출금해줘");
		Account chulGumAccount = accountServiceReturn.chulGum(1111, 500);
		chulGumAccount.print();
		/*
		 * 정렬기준(standard) --> 1:번호,2:이름,3:잔고,4:이율 정렬방법(order) --> 1:오름차순,2:내림차순
		 */
		System.out.println("10.AccountServiceReturn객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceReturn.sort(3, 1);
		accountServiceReturn.print(); /* 출력하라는 말은 없지만.. 확인차 프린트! */
		System.out.println("11.AccountServiceReturn객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceReturn.sort(3, 2);
		accountServiceReturn.print(); // 확인용 프린트!
		System.out.println("12.AccountServiceReturn야 계좌객체줄께 이름,잔고,이율 수정(update)해줘");
		// 편의를 위해 번호 기준 오름차순으로 정렬하였음!
		accountServiceReturn.sort(1, 1);
		// 인덱스 번호
		Account updateAcc = accountServiceReturn.getAccounts(1);
		accountServiceReturn.updateAccount(updateAcc);
		accountServiceReturn.print();
		System.out.println("13.AccountServiceReturn야 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountServiceReturn.updateAccount(2222, "JIM", 77000, 4.2);
		accountServiceReturn.print();
		System.out.println("14.AccountServiceReturn객체야 계좌번호줄께 계좌삭제한후 삭제한계좌객체반환해줘[OPTION]");
		Account deleteAcc = accountServiceReturn.deleteByNo(1111);
		deleteAcc.print();

		/***** 출력하라는 말은 없었지만 확인 차 프린트 해보았음 *****/
	}

}