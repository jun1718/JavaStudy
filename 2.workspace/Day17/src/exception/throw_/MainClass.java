package exception.throw_;

public class MainClass {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		
		acc.deposit(10000);
		System.out.printf("입금 후 잔액: %d원\n", acc.getBalance());
		
		try {			
			acc.withDraw(70000);
		} catch(BalanceInsufficientException e) {
			//e.printStackTrace();
			/*
			 * -예외 클래스가 제공하는 getMessage() 메서드는 예외의 원인 메시지를 String 
			 * 타입으로 리턴함.
			 * 자바 표준 API에서 제공하는 다양한 예외클래스들은 각각의 예외 원인 메시지가
			 * 기본적으로 객체안에 저장되어있음(기본생성자안에 super로보낼 메세지에 기본값으로
			 * 정해두는 거임 
			 */
			System.out.println(e.getMessage());
		}
		System.out.printf("출금 후 잔액 :  %d원\n", acc.getBalance());
	}

}
