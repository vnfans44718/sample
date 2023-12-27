package com.itwill05.service.array.account;

/*
 * Account객체 전체에 관련된 업무를 실행할 클래스
 * 		1. 계좌객체들(Account[]) 을 멤버변수로 가진다.
 * 		2. 계좌객체들을 사용해서 업무실행
 */

public class AccountService {

	public static final int SORT_BY_NO = 1;
	public static final int SORT_BY_OWNER = 2;
	public static final int SORT_BY_BALANCE = 3;
	public static final int SORT_BY_IYUL = 4;

	public static final int SORT_ASC = 1;
	public static final int SORT_DESC = 2;

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
	private Account[] accounts;

	public AccountService() {
		accounts = new Account[9];
		accounts[0] = new Account(1111, "KIM", 89000, 1.3);
		accounts[1] = new Account(2222, "AIM", 45000, 2.7);
		accounts[2] = new Account(3333, "FIM", 89000, 4.7);
		accounts[3] = new Account(4444, "XIM", 34000, 6.7);
		accounts[4] = new Account(5555, "hIM", 78000, 3.7);
		accounts[5] = new Account(6666, "KIM", 89000, 5.7);
		accounts[6] = new Account(7777, "KIM", 89000, 4.7);
		accounts[7] = new Account(8888, "qIM", 91000, 1.7);
		accounts[8] = new Account(9999, "mIM", 12000, 0.7);
	}

	/*
	  << 과제 아님 >>
	   0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		Account[] tempAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			tempAccounts[i] = accounts[i];
		}
		Account newAccount1 = newAccount;
		tempAccounts[tempAccounts.length - 1] = newAccount1;
		accounts = tempAccounts;

		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 * << 과제 아님 >>
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no, String owner, int balance, double iyul) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		Account[] tempAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			tempAccounts[i] = accounts[i];
		}
		Account newAccount = new Account(no, owner, balance, iyul);
		tempAccounts[tempAccounts.length - 1] = newAccount;
		accounts = tempAccounts;

		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 1.은행계좌들 총 계좌수 출력 메쏘드 정의
	 */
	public void totAccountNumberPrint() {
		System.out.println(">> 은행계좌들 총 계좌 수: " + this.accounts.length);

	}

	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 * 3.은행계좌들 총 잔고 출력 메쏘드 정의
	 */
	public void totBalancePrint() {
		for (Account account : accounts) {
			System.out.println("은행계좌 총 잔고 출력: " + account.getBalance());
		}
	}

	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.print();
				break;
			}
		}

	}

	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들 출력
	 */
	public void findByBalancePrint(int balance) {
		for (Account account : accounts) {
			if (account.getBalance() >= balance) {
				account.print();
			}
		}
	}

	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들 출력
	*/
	public void findByIyulPrint(double iyul) {
		for (Account account : accounts) {
			if (account.getIyul() >= iyul) {
				account.print();
			}
		}
	}

	/*
	7.계좌주이름 인자로 받아서 인자이름과 동일한 계좌들 출력
	 */
	public void findByNamePrint(String name) {
		for (Account account : accounts) {
			if (account.getOwner().equals(name)) {
				account.print();
			}
		}
	}

	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public void ipGum(int no, int m) {
		/*
		 * 1.계좌번호로 계좌찾기
		 * 2.입금
		 */
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.deposit(m);
				account.print();
			}
		}
	}

	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public void chulGum(int no, int m) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.withDraw(m);
				account.print();
			}
		}
	}

	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				} else if (accounts[j].getBalance() == accounts[j + 1].getBalance()) {
					if (accounts[j].getNo() > accounts[j + 1].getNo()) {
						Account tempAccount = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempAccount;
					}
				}
			}
		}
		for (Account account : accounts) {
			account.print();
		}

	}

	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDescending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				} else if (accounts[j].getBalance() == accounts[j + 1].getBalance()) {
					if (accounts[j].getNo() < accounts[j + 1].getNo()) {
						Account tempAccount = accounts[j];
						accounts[j] = accounts[j + 1];
						accounts[j + 1] = tempAccount;
					}
				}
			}
		}
		for (Account account : accounts) {
			account.print();
		}
	}

	/*
	 << 과제 아님 >>
	 10.<< 정렬 >> 
	 * sortField --> 1:번호,2:이름,3:잔고,4:이율
	 * sortOrder --> 1:오르차순,2:내림차순
	 */
	public void sort(int sortField, int sortOrder) {

	}

	/*
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		for (Account account : accounts) {
			if (account == updateAccount) {
				account.setNo(updateAccount.getNo());
				account.setBalance(updateAccount.getBalance());
				account.setIyul(updateAccount.getIyul());
				account.print();
			}
		}
	}

	/*
	<< 과제 아님 >>
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	public void updateAccount(int no, String owner, int balance, double iyul) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.setOwner(owner);
				account.setBalance(balance);
				account.setIyul(iyul);
				account.print();
			}
		}
	}
}
