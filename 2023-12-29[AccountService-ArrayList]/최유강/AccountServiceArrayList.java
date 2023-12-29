package com.itwill05.service.collection.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		for (Account tAccount : accountList) {
			if (tAccount.getNo() == account.getNo()) {
				return false;
			}
		}
		accountList.add(account);
		/*
		 * 번호중복체크후 중복이면 호출한클래스에게 false 중복이 아니면 accountList에 add하고 호출한클래스에게 true 를
		 * 반환해줌[OPTION]
		 */
		// accountList.add(account);

		return true;
	}

	public void add(boolean addAccount) {
		if (addAccount) {
			System.out.println("account추가성공");
		} else {
			new DuplicationException();
		}
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
			accountList.get(i).print();
		}

		/*
		 * // enhanced for문 for(Account tempAccount:accountList) { tempAccount.print();
		 * }
		 */

	}

	/*
	 * 3.은행계좌들 총잔고 반환메쏘드 정의
	 */
	public int totBalance() {
		int totBalance = 0;
		for (Account account : accountList) {
			totBalance += account.getBalance();
		}
		return totBalance;
	}

	/*
	 * 4.계좌번호 인자로받아서 번호와일치하는 계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) throws MemberNotFoundException {
		Account findAccount = null;
		for (Account account : accountList) {
			if (account.getNo() == no) {
				findAccount = account;
				break;
			}
		}
		if (findAccount == null)
			throw new MemberNotFoundException("입력하신 계좌번호를 확인해주세요.");
		return findAccount;
	}

	/*
	 * 5.계좌잔고 인자로 받아서 잔고이상인 계좌들반환
	 */
	public List<Account> findByBalance(int balance) throws MemberNotFoundException {// List로 상위 캐스팅하면 의존성 좋다.
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (Account account : accountList) {
			if (account.getBalance() >= balance) {
				findAccountList.add(account);
			}
		}
		if (findAccountList.size() == 0) {
			throw new MemberNotFoundException("입력한 조건에 해당하는 계좌가 없습니다.");
		}
		return findAccountList;
	}

	/*
	 * 8.6666번계좌 4000원 입금한후 입금계좌 참조변수반환
	 */
	public Account ipGum(int no, int m) throws MemberNotFoundException {
//		Account a = null;
//		for (int i = 0; i < accountList.size(); i++) {
//			if(accountList.get(i).getNo()==no) {
//				accountList.get(i).deposit(m);
//				a = accountList.get(i);
//				break;
//			}
//		}
//		
//		return a;
		findByNo(no).deposit(m);
		return findByNo(no);
	}

	/*
	 * 9.1111번계좌 5000원 출금한후 출금계좌 참조변수반환
	 */
	public Account chulGum(int no, int m) throws MemberNotFoundException, LackOfFundsException {
		findByNo(no).withDraw(m);
		return findByNo(no);
	}

	/*
	 * 7.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	 */
	public ArrayList<Account> findByName(String owner) throws MemberNotFoundException {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (Account account : accountList) {
			if (account.getOwner().equals(owner)) {
				findAccountList.add(account);
			}
		}
		if (findAccountList.size() == 0) {
			throw new MemberNotFoundException("입력한 계좌주에 해당하는 계좌가 없습니다.");
		}
		return findAccountList;
	}

	/*
	 * 9.VIP계좌(잔고 70000원이상)들 반환
	 */
	public ArrayList<Account> findByVip(int balance) {
		ArrayList<Account> findAccountList = new ArrayList<Account>();
		for (Account account : accountList) {
			if (account.getBalance() >= balance) {
				findAccountList.add(account);
			}
		}
		return findAccountList;
	}

	/*
	 * 10.계좌를 잔고순으로 오름차순정렬 Collections.sort();
	 */
	public void sortByBalanceAsc() {
		for (int i = 0; i < accountList.size() - 1; i++) {
			for (int j = 0; j < accountList.size() - i - 1; j++) {
				Account a = accountList.get(j);
				Account b = accountList.get(j + 1);
				if (a.getBalance() > b.getBalance()) {
					// a랑b랑 자리 바꿔
//					Account c = accountList.set(j, b);
//					accountList.set(j+1, c);
					accountList.set(j + 1, accountList.set(j, b));
				}
			}
		}
	}

	/*
	 * 11.계좌를 잔고순으로 내림차순정렬 Collections.sort();
	 */
	public void sortByBalanceDesc() {
		for (int i = 0; i < accountList.size() - 1; i++) {
			for (int j = 0; j < accountList.size() - i - 1; j++) {
				Account a = accountList.get(j);
				Account b = accountList.get(j + 1);
				if (a.getBalance() > b.getBalance()) {
					// a랑b랑 자리 바꿔
					accountList.add(j, b);
					accountList.remove(j + 2);
				}
			}
		}
	}

	/*
	 * 12.6666번계좌의 이름,잔고,이율 수정(update)후 수정된객체 반환
	 */
	public Account updateAccount(Account updateAccount) throws MemberNotFoundException {
		Account upd = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account t = accountList.get(i);
			if (t.getNo() == updateAccount.getNo()) {
				accountList.set(i, updateAccount);
				upd = accountList.get(i);
				break;
			}
		}
		if (upd == null) {
			throw new MemberNotFoundException("갱신할 계좌를 찾지 못했습니다.");
		}
		return upd;
	}

	/*
	 * 13.번호로 계좌삭제후 삭제된객체반환
	 */
	public Account deleteByNo(int no) throws MemberNotFoundException {
		Account deleteAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account t = accountList.get(i);
			if (t.getNo() == no) {
				deleteAccount = accountList.remove(i);
				break;
			}
		}
		if (deleteAccount == null)
			throw new MemberNotFoundException("삭제할 계좌를 찾지 못했습니다.");
		return deleteAccount;
	}

}