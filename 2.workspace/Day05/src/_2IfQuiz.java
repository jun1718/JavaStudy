import java.util.Scanner;

public class _2IfQuiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다");
			return;
		} else if(num < 0) {
			System.out.println("음의 정수입니다.");
			return;			
		}
		
		if(num % 2 == 0) {
			System.out.println("x는 짝수입니다.");
		} else {
			System.out.println("x는 홀수입니다.");			
		}
		
	}//end main
}//end class
