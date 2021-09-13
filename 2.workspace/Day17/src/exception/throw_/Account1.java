package exception.throw_;

public class Account1 {
	private long balance;
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws Exception{
		if(balance<money) {
			throw new Exception(); //잔액이 출금액보다 작으면 음수로처리하면되잖아?
							//즉 이블록에는 에러가 없어! 라고 얘기해서 해당 조건식만으로는
						//에러가안난다. 하지만 우리가 볼때 세상에 음수인돈은 없다.
			//그래서 개발자가 강제로 throw를 이용하여 에러를 발생시킨다. 그리고 해당되는것은
			//호출부에서 try로 받아야한다.
		}
		balance -= money;
	}
}
