
public class Account {
	String name; //이름
	int password; //비밀번호
	int balance; //입금액
	Account(){}
	Account(String aname, int pw, int money){
		name = aname;
		password = pw;
		balance = money;
	}
	//입금기능
	void deposit(int money){
		balance += money;
		System.out.println(money+"원 입금이 완료되었습니다.");
	}
	//출금기능
	void withDrawMoney(int money){
		balance -= money;
		System.out.println(money+"원 출금이 완료되었습니다.");
	}
	//잔액조회기능
	int getBalance(){
		return balance;
	}
}
