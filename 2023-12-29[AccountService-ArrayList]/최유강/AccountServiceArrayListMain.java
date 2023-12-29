package com.itwill05.service.collection.account;

import java.util.ArrayList;

import com.itwill05.service.array.account.AccountService;

public class AccountServiceArrayListMain {

	public static void main(String[] args) throws MemberNotFoundException, LackOfFundsException {

		AccountServiceArrayList accountServiceArrayList = new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList야 은행계좌추가해줘");
		Account addAccount = new Account(1000, "고소영", 89000, 0.5);

		accountServiceArrayList.add(accountServiceArrayList.addAccount(addAccount));
		accountServiceArrayList.add(accountServiceArrayList.addAccount((new Account(1000, "이소라", 30000, 3.3))));

		System.out.println("1.AccountServiceArrayList야 은행계좌들 총계좌수반환해줘");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("총계좌수[main]:" + accountCount);
		System.out.println("2.AccountServiceArrayList야 은행계좌들 전체출력해줘");
		accountServiceArrayList.print();

		System.out.println("3.AccountServiceArrayList야은행계좌들 총잔고 반환해줘");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("총잔고[main]:" + totBalance);
		System.out.println("4.AccountServiceArrayList야 계좌번호줄께 계좌한개반환해줘");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		System.out.println("계좌한개[main]");
		findAccount.print();
		System.out.println("5.AccountServiceArrayList야 계좌잔고줄께 잔고이상인 계좌들반환해줘[OPTION]");
		ArrayList<Account> findAccounts;
		try {
			findAccounts = (ArrayList<Account>) accountServiceArrayList.findByBalance(50000);
			for (Account account : findAccounts) {
				account.print();
			}
			System.out.println(" 반환계좌수:" + findAccounts.size());
		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("7.AccountServiceArrayList야은행계좌들 중에 계좌주이름이 AIM인 계좌들반환해줘");
		try {
			findAccounts = accountServiceArrayList.findByName("AIM");
			for (Account account : findAccounts) {
				account.print();
			}
			System.out.println(" 반환계좌수:" + findAccounts.size());

		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		}

		/*
		 * 8.6666번계좌 4000원 입금해줘
		 */
		System.out.println("8.AccountServiceArrayList야1111번계좌 50000원 출금한후에 Account객체반환해줘");
		try {
			Account chulGumAccount = accountServiceArrayList.chulGum(1111, 500000);
			chulGumAccount.print();
		} catch (MemberNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (LackOfFundsException e) {
			e.printStackTrace();
		}
		System.out.println(" 8.6666번계좌 4000원 입금한후 Account객체반환받음");
		try {

			Account ipGumAccount = accountServiceArrayList.ipGum(6666, 4000);
			ipGumAccount.print();
		} catch (MemberNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("9.VIP계좌(잔고 70000원이상)들 반환해줘");
		try {
			findAccounts = (ArrayList<Account>) accountServiceArrayList.findByBalance(70000);
			for (Account account : findAccounts) {
				account.print();
			}
			System.out.println(" 반환계좌수:" + findAccounts.size());
		} catch (MemberNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("10.계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();
		System.out.println("11.계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();

		try {

			System.out.println(" 12.6666번계좌의 이름,잔고,이율 수정(update)후 Account객체반환받음");
			Account updateAccount1 = new Account(6666, "YYY", 900000000, 0.4);
			accountServiceArrayList.updateAccount(updateAccount1).print();

			System.out.println(" 12.8888번계좌삭제후 Account객체반환받음");
			accountServiceArrayList.deleteByNo(8888).print();
		} catch (MemberNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("-----------전체계좌 출력-------------");
		accountServiceArrayList.print();
	}

}