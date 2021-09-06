
import java.util.Scanner;

class AccountManager {

	static Scanner scan = new Scanner(System.in);
	
//codeCopy
	public static int inputPassword(Account p1){
		System.out.println("\n계좌 비밀번호를 입력하세요.");
		System.out.print("> ");
		int password = scan.nextInt();
		if(p1.password != password){
			System.out.println("비밀번호가 틀렸습니다. 메뉴로 돌아갑니다.");
		}
		return password;
	}


//userDefinedMethod
	public static void setAccountInfo(Account p1){
		System.out.println("계좌를 등록합니다.");

		System.out.print("이름: ");
		p1.name = scan.next();
		System.out.print("비밀번호: ");
		p1.password = scan.nextInt();

		System.out.print("입금액: ");
		p1.balance = scan.nextInt();
	}
	public static int setMenu(){
		System.out.println("\n메뉴를 입력하세요.");
		System.out.println("1. 예금 / 2. 출금 / 3 잔액조회 / 4. 종료");
		System.out.print("> ");
		int menu = scan.nextInt();
		return menu;
	}
	public static void deposit(Account p1){
		int password = inputPassword(p1);

		if (p1.password == password){
			System.out.println("\n입금액을 입력하세요");
			System.out.print("> ");
			int money = scan.nextInt();
			
			p1.deposit(money);
			
		}
	}
	public static void withDrawMoney(Account p1){
		int password = inputPassword(p1);

		if(p1.password == password){
			System.out.println("\n출금액을 입력하세요");
			System.out.print("> ");
			int money = scan.nextInt();
			
			if(money>p1.getBalance()){
				System.out.println("당신 돈 부족해! 돈부터 채워 잔액이 부족합니다.");
				return;
			}
			p1.withDrawMoney(money);
		}
	}
	public static void balanceCheck(Account p1){
		int password = inputPassword(p1);
		if (p1.password == password){
			System.out.printf("%s님의 계좌잔액은 %d원입니다.\n", p1.name, p1.getBalance());
		}
	}

//main
	public static void main(String[] args) {
		Account p1 = new Account();
		setAccountInfo(p1);

		while(true){
			int menu = setMenu();

			if(menu==1){
				deposit(p1);
			}
			else if(menu==2){
				withDrawMoney(p1);
			}
			else if(menu==3){
				balanceCheck(p1);
			}
			else if(menu==4){
				System.out.println("\n프로그램을 종료합니다.");
				System.exit(0);
			}
		}//while
		
	}//main
	
}//class