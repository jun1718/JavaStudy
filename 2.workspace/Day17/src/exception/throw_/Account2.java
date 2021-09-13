package exception.throw_;
/*
 * account1에서 exception으로 throwthrows를 이용해 강제에러를 발생시켰는데
 * 개발자가 더 완벽하게 에러를 띄우고 싶다.
 */
public class Account2 {
	private long balance;
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws BalanceInsufficientException{
		if(balance<money) {
			//throw new BalanceInsufficientException("잔고가 부족합니다.");
			throw new BalanceInsufficientException();
		}
		balance -= money;
	}
}
