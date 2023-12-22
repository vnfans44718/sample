package com.itwill05.service.account;

public class AccountService {

	public static final int SORT_BY_NO = 1;
	public static final int SORT_BY_OWNER = 2;
	public static final int SORT_BY_BALANCE = 3;
	public static final int SORT_BY_IYUL = 4;

	public static final int SORT_ASC = 1;
	public static final int SORT_DESC = 2;

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

	public void addAccount(Account newAccount) {
		Account[] accounts = new Account[this.accounts.length + 1];
		for (int i = 0; i < this.accounts.length; i++) {
			accounts[i] = this.accounts[i];
		}
		accounts[this.accounts.length] = newAccount;
		this.accounts = accounts;

	}

	public void addAccount(int no, String owner, int balance, double iyul) {
		Account[] accounts = new Account[this.accounts.length + 1];
		for (int i = 0; i < this.accounts.length; i++) {
			accounts[i] = this.accounts[i];
		}
		accounts[this.accounts.length] = new Account(no, owner, balance, iyul);
		this.accounts = accounts;
	}

	public void totAccountNumberPrint() {
		System.out.println("총 계좌수 : " + accounts.length);
	}

	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	public void totBalancePrint() {
		int totBalance = 0;
		for (Account account : accounts) {
			totBalance += account.getBalance();
		}
		System.out.println("은행 계좌 총 잔고 : " + totBalance);
	}

	public void findByNoPrint(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				break;
			}
		}

	}

	public void findByBalancePrint(int balance) {
		for (Account account : accounts) {
			if (account.getBalance() > balance) {
				account.print();
			}
		}
	}

	public void findByIyulPrint(double iyul) {
		for (Account account : accounts) {
			if (account.getIyul() > iyul) {
				account.print();
			}
		}
	}

	public void findByNamePrint(String name) {
		for (Account account : accounts) {
			if (account.getOwner().equals(name)) {
				account.print();
			}
		}
	}

	public void ipGum(int no, int m) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.deposit(m);
			}
		}
	}

	public void chulGum(int no, int m) {
		for (Account account : accounts) {
			if (account.getNo() == no) {
				account.withDraw(m);
			}
		}
	}

	/*
	 << 과제 아님 >>
	 10.<< 정렬 >> 
	 * sortField --> 1:번호,2:이름,3:잔고,4:이율
	 * sortOrder --> 1:오르차순,2:내림차순
	 */
	public void sort(int sortField, int sortOrder) {
		switch (sortField) {
		case SORT_BY_NO:
			if (sortOrder == SORT_ASC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getNo() > accounts[j + 1].getNo()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			} else if (sortOrder == SORT_DESC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getNo() < accounts[j + 1].getNo()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			}
			break;
		case SORT_BY_OWNER:
			if (sortOrder == SORT_ASC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getOwner().compareTo(accounts[j + 1].getOwner()) > 0) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			} else if (sortOrder == SORT_DESC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getOwner().compareTo(accounts[j + 1].getOwner()) < 0) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			}
			break;
		case SORT_BY_BALANCE:
			if (sortOrder == SORT_ASC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			} else if (sortOrder == SORT_DESC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			}
			break;
		case SORT_BY_IYUL:
			if (sortOrder == SORT_ASC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getIyul() > accounts[j + 1].getIyul()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			} else if (sortOrder == SORT_DESC) {
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1 - i; j++) {
						if (accounts[j].getIyul() < accounts[j + 1].getIyul()) {
							Account temp = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = temp;
						}
					}
				}
			}
			break;
		}

	}

	public void sortByBalanceAscending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account temp = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = temp;
				}
			}
		}
	}

	public void sortByBalanceDescending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
					Account temp = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = temp;
				}
			}
		}
	}

	/*
	 << 과제 아님 >>
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		/*
		for (Account account : accounts) {	 
			if (account.getNo() == updateAccount.getNo()) {
				account = updateAccount;	<-- account가 지역변수라 updateAccount를 대입해도 실제 값은 바뀌지 않음..
			}
		}
		*/
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == updateAccount.getNo()) {
				accounts[i] = updateAccount;
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
				account.setNo(no);
				account.setOwner(owner);
				account.setBalance(balance);
				account.setIyul(iyul);
			}
		}
	}
}