package com.itwill05.service.collection.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 1.ArrayList<Account>(계좌객체들) 을멤버변수로가진다.
 * 2.Account객체전체에관련된 업무를 실행할클래스
 */
public class AccountServiceArrayList {
	private ArrayList<Account> accountList;

	public AccountServiceArrayList() {
		accountList = new ArrayList<Account>();
		accountList.add(new Account(1111, "KIM", 89000, 1.3));
		accountList.add(new Account(2222, "AIM", 45000, 2.7));
		accountList.add(new Account(3333, "FIM", 23000, 4.7));
		accountList.add(new Account(4444, "XIM", 34000, 6.7));
		accountList.add(new Account(5555, "HIM", 78000, 3.7));
		accountList.add(new Account(6666, "AIM", 99000, 5.7));
		accountList.add(new Account(7777, "PIM", 89000, 4.7));
		accountList.add(new Account(8888, "QIM", 91000, 1.7));
		accountList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	 * private Account[] accounts= { new Account(1111, "KIM", 89000, 1.3), new
	 * Account(2222, "AIM", 45000, 2.7), new Account(3333, "FIM", 89000, 4.7), new
	 * Account(4444, "XIM", 34000, 6.7), new Account(5555, "hIM", 78000, 3.7), new
	 * Account(6666, "KIM", 89000, 5.7), new Account(7777, "KIM", 89000, 4.7), new
	 * Account(8888, "qIM", 91000, 1.7), new Account(9999, "mIM", 12000, 0.7), };
	 * 
	 */

	/*
	 * 계좌전체반환
	 */
	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	/*
	 * 계좌추가
	 */
	public boolean addAccount(Account account) {
		/*
		 * 번호중복체크후 중복이면 호출한클래스에게 false 중복이 아니면 accountList에 add하고 호출한클래스에게 true 를
		 * 반환해줌[OPTION]
		 */
		// accountList.add(account);
		for (int j = 0; j < accountList.size(); j++) {
			Account booAccount = (Account) accountList.get(j);// accountList의 객체를 Account로 형변환
			if (booAccount.getNo() == account.getNo()) {
				return false; // 하나라도 겹치면 false를 반환하고 if문과 for문을 빠져나가야 된다~~!!!!!
			}
		}

		accountList.add(account);
		return true;// true로 반환되려면 중복이 아니어야한다.

	}

	/*
	 * 1.은행계좌들 총계좌수반환메쏘드정의
	 */

	public int totAccountNumber() {
		return accountList.size();

	}

	/*
	 * 2.은행계좌들 전체출력메쏘드정의
	 */
	public void print() {
		Account.headerPrint();
		/*
		 * for (int i = 0; i < accountList.size(); i++) { Account tempAccount =
		 * accountList.get(i); tempAccount.print(); }
		 */
		/*
		 * // enhanced for문 for(Account tempAccount:accountList) { tempAccount.print();
		 * }
		 */

		for (Account account : accountList) {
			account.print();
		}
	}

	/*
	 * 3.은행계좌들 총잔고 반환메쏘드 정의
	 */
	public int totBalance() {
		int totMoney = 0;
		for (int i = 0; i < accountList.size(); i++) {
			Account acc = (Account) accountList.get(i);
			totMoney += acc.getBalance();
		}

		return totMoney;
	}

	/*
	 * 4.계좌번호 인자로받아서 번호와일치하는 계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) {
		Account findAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account oneAccount = (Account) accountList.get(i);
			if (oneAccount.getNo() == no) {
				findAccount = oneAccount;
				break;//@@@@@@@@@@@@@@@@@@해야돼~~
			}
		}

		return findAccount;
	}

	/*
	 * 5.계좌잔고 인자로 받아서 잔고이상인 계좌들반환
	 */
	public ArrayList<Account> findByBalance(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>(); // 조건충족 객체를 받아 넣을 List
		for (int i = 0; i < accountList.size(); i++) {
			Account richAccount = (Account) accountList.get(i);
			if (richAccount.getBalance() >= balance) {
				findAccountList.add(richAccount);
			}
		}
		return findAccountList;
	}

	/*
	 * 7.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	 */
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			Account nameAccount = (Account) accountList.get(i);
			if (nameAccount.getOwner().equals(owner)) {
				findAccountList.add(nameAccount);
			}
		}
		return findAccountList;
	}

	/*
	 * 8.6666번계좌 4000원 입금한후 입금계좌 참조변수반환
	 */
	public Account ipGum(int no, int m) {
		Account tempAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account numberAccount = (Account) accountList.get(i);
			if (numberAccount.getNo() == no) {
				numberAccount.deposit(m);
				tempAccount = numberAccount;
			}
		}
		return tempAccount;
	}

	/*
	 * 9.1111번계좌 5000원 출금한후 출금계좌 참조변수반환
	 */
	public Account chulGum(int no, int m) {
		Account tempAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account numberAccount = (Account) accountList.get(i);
			if (numberAccount.getNo() == no) {
				numberAccount.withDraw(m);
				tempAccount = numberAccount;
			}
		}
		return tempAccount;
	}

	/*
	 * 9.VIP계좌(잔고 70000원이상)들 반환
	 */
	public ArrayList<Account> findByVip(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			Account nameAccount = (Account) accountList.get(i);
			if (nameAccount.getBalance() >= balance) {
				findAccountList.add(nameAccount);
			}
		}
		return findAccountList;
	}

	/*
	 * 10.계좌를 잔고순으로 오름차순정렬 Collections.sort();
	 */
	public void sortByBalanceAsc() {
		Collections.sort(accountList, new Comparator<Account>() {// 첫 번째 인자: 정렬할 List인 accountList를 전달
			/*
			 * 두번째 인자: 익명 클래스(anonymous class)를 사용하여 Comparator<Account> 인터페이스를 구현합니다. 이 익명
			 * 클래스는 비교 로직을 정의합니다.
			 */
			@Override
			public int compare(Account account1, Account account2) {// 이게 아마 accountList의 객체 accout1과 account2를 비교한다. (즉
																	// 객체의 잔고를
				return Integer.compare(account1.getBalance(), account2.getBalance());// 그리고 그 비교 기준이 잔고이다.

				/*
				 * 다음은 compare메소드의 내용이다
				 * 
				 * public static int compare(int x, int y) { return (x < y) ? -1 : ((x == y) ? 0
				 * : 1); }
				 */
				// 일반적으로 compareTo() 메소드는 오름차순으로 정렬하기 위해 사용됩니다
			}
		});// 여기서 Collections.sort() 메소드가 끝난다.
	}

	/*
	 * 11.계좌를 잔고순으로 내림차순정렬 Collections.sort();
	 */
	public void sortByBalanceDesc() {
	    Collections.sort(accountList, new Comparator<Account>() {
	        @Override
	        public int compare(Account account1, Account account2) {
	            return Integer.compare(account2.getBalance(), account1.getBalance());
	        }
	    });
	}
	/*
	 * 	public void sortByBalanceAsc() {
		Account tempAccount = new Account();
		for (int i = 0; i < accountList.size()-1; i++) {
			for (int j = 0; j < accountList.size() -1 -i; j++) {
				if(accountList.get(j).getBalance() > accountList.get(j+1).getBalance()) {
					tempAccount = accountList.get(j);
					accountList.set(j, accountList.get(j+1));
						//이게 중요 List에서 객체요소끼리 순서를 바꿀때는 set메소드 이용
						//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
					accountList.set(j+1, tempAccount);
				}
			}
		}
		
	}
	 */

	/*
	 * 12.6666번계좌의 이름,잔고,이율 수정(update)후 수정된객체 반환
	 */
	public Account updateAccount(Account updateAccount) {
		Account acc2 = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account acc =(Account)accountList.get(i);
			if(acc.getNo() == updateAccount.getNo()) {
				accountList.set(i, updateAccount);
				
			}
		}
		return acc2;
	}
	
	/*
	 * public void sortByBalanceDesc() {
		Account tempAccount = new Account();
		for (int i = 0; i < accountList.size()-1; i++) {
			for (int j = 0; j < accountList.size() -1 -i; j++) {
				if(accountList.get(j).getBalance() < accountList.get(j+1).getBalance()) {
					tempAccount = accountList.get(j);
					accountList.set(j, accountList.get(j+1));
					accountList.set(j+1, tempAccount);
				}
			}
		}
		
	}
	 */

	/*
	 * 13.번호로 계좌삭제후 삭제된객체반환
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account acc =(Account)accountList.get(i);
			if(acc.getNo() == no) {
				deleteAccount =(Account)accountList.remove(i);
			}
		}
		return deleteAccount;
	}

}
