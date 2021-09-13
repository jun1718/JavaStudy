package exception.throw_;
/*
 * 사용자정의 예외클래스를 만들려면 Exception클래스나 RUntimeException 클래스를
 * 상속해야한다.
 */
public class BalanceInsufficientException extends Exception{
	/*
	 * 일반적으로 사용자 정의 예외 클래스를 만들때는 
	 * 기본 생성자와 예외 원인 메시지를 매개값으로 받는 생성자를
	 * 선언함 
	 * 매개값은 Exception의 생성자로 보내야함
	 */
	public BalanceInsufficientException() {
		super("잔고가 부족합니다.기본생성자");
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
