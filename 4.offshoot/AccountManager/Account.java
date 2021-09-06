
public class Account {
	String name;
	int password;
	int balance;
	
	void deposit(int money) {
		balance += money;
		System.out.println(money+"원 입금되었습니다.");
	}
	void withDrawMoney(int money) {
		balance -= money;
		System.out.println(money+"원 출금되었습니다.");
	}
	int getBalance() {
		return balance;
	}
}
