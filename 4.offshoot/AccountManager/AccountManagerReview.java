import java.util.Scanner;

public class AccountManagerReview {
	static Scanner scan = new Scanner(System.in);
	
	public static int pwCheck(Account p1) {
		System.out.println("계좌 비밀번호를 입력하세요.");
		System.out.print("> ");
		int password = scan.nextInt();
		if(p1.password!=password) {
			System.out.println("비밀번호가 틀렸습니다.\n메뉴로 돌아갑니다.");
		}
		return password;
	}
	
	
	
	
	public static void accountAccounting(Account p1) {
		System.out.println("계좌를 등록합니다.");
		System.out.print("이름: ");
		p1.name = scan.next();
		
		System.out.print("비밀번호: ");
		p1.password = scan.nextInt();
		
		System.out.print("처음 입금액: ");
		p1.balance = scan.nextInt();
	}
	public static int menu() {
		System.out.println("\n메뉴를 입력하세요.");
		System.out.println("1.예금 / 2.출금 / 3.잔액조회 / 4.종료");
		System.out.print("> ");
		int menu = scan.nextInt();
		
		return menu;
	}
	public static void deposit(Account p1) {
		if(pwCheck(p1)==p1.password) {	
			System.out.print("입금액 입력: ");
			int money = scan.nextInt();
			p1.deposit(money);
		}
	}
	public static void withDrawMoney(Account p1) {
		if(pwCheck(p1)==p1.password) {	
			System.out.print("출금액 입력: ");
			int money = scan.nextInt();
			
			if(money>p1.balance) {
				System.out.println("잔액부족입니다! 슈퍼가서 돈넣고 오세요^^");
				return;
			}
			
			p1.withDrawMoney(money);
		}
	}	
	public static void getBalance(Account p1) {
		if(pwCheck(p1)==p1.password) {			
			System.out.println(p1.name+"님의 계좌잔액은 "+p1.getBalance()+"원입니다.");
		}
	}
	
	public static void main(String[] args) {
		Account p1 = new Account();
		accountAccounting(p1);	
		
		while(true) {
			int menu = menu();
			
			if(menu==1) {
				deposit(p1);
			}
			if(menu==2) {
				withDrawMoney(p1);
			}
			if(menu==3) {
				getBalance(p1);
			}
			if(menu==4) {
				System.out.println("\n프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
