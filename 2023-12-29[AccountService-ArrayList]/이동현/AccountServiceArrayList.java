package com.itwill06.collection.practice6_16.account;



import java.util.ArrayList;


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
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 89000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7),
			new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7),
			new Account(8888, "qIM", 91000, 1.7),
			new Account(9999, "mIM", 12000, 0.7),
	};
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
		 * 번호중복체크후 
		 * 중복이면      호출한클래스에게 false
		 * 중복이 아니면 accountList에 add하고  호출한클래스에게 true 를 반환해줌[OPTION]
		 */
		//accountList.add(account);
		
		return true;
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

		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}

		/*
		 * // enhanced for문 
		 * for(Account tempAccount:accountList) { 
		 * 	tempAccount.print();
		 * }
		 */

	}

	/*
	 * 3.은행계좌들 총잔고 반환메쏘드 정의
	 */
	public int totBalance() {
		int totBalance = 0;
		for (int i = 0; i < accountList.size(); i++) {
			totBalance = accountList.get(i).getBalance() + totBalance;
		}

		return totBalance;
	}

	/*
	 * 4.계좌번호 인자로받아서 번호와일치하는 계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) {
		Account findAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo() == no) {
				findAccount = accountList.get(i);
				break;
			}
		}
		return findAccount;
	}

	/*
	 * 5.계좌잔고 인자로 받아서 잔고이상인 계좌들반환
	 */
	public ArrayList<Account> findByBalance(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (Account account : accountList) {
			if (account.getBalance() >= balance) {
				findAccountList.add(account);
			}
		}

		return findAccountList;
	}

	/*
	 * 8.6666번계좌 4000원 입금한후 입금계좌 참조변수반환
	 */
	public  Account ipGum(int no, int m) {
		Account tempAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo() == no) {
				accountList.get(i).deposit(m);
				tempAccount = accountList.get(i);
				break;
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
			if (accountList.get(i).getNo() == no) {
				accountList.get(i).withDraw(m);
				tempAccount = accountList.get(i);
				break;
			}
		}
		return tempAccount;
	}

	/*
	 * 7.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	 */
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getOwner().equals(owner)) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}

	/*
	 * 9.VIP계좌(잔고 70000원이상)들 반환
	 */
	public ArrayList<Account> findByVip() {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (Account account : accountList) {
			if (account.getBalance() >= 70000) {
				findAccountList.add(account);
			}
		}
		return findAccountList;
	}

	/*
	 * 10.계좌를 잔고순으로 오름차순정렬
	 *  	Collections.sort();
	 */
	public void sortByBalanceAsc() {
		
	}

	/*
	 * 11.계좌를 잔고순으로 내림차순정렬
	 * 		Collections.sort();
	 */
	public void sortByBalanceDesc() {

	}

	/*
	 * 12.6666번계좌의 이름,잔고,이율 수정(update)후 수정된객체 반환
	 */
	public Account updateAccount(Account updateAccount) {
		Account tempAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo() == 6666) {
				accountList.set(i, updateAccount);
				tempAccount = accountList.get(i);
			}
		}
		return tempAccount;
	}

	/*
	 * 13.번호로 계좌삭제후 삭제된객체반환
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getNo() == no) {
				deleteAccount = accountList.remove(i);
			}
		}
		return deleteAccount;
	}

}
