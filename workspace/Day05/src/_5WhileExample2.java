import java.util.Scanner;

public class _5WhileExample2 {
	public static void main(String[] args) {
		//정수를 이력받아서 해당 정수가 소수인지 판별
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력: ");
		int num = scan.nextInt();
		
		int i=2;
		while (num%i != 0) {
			i++;
		}
		if (i == num) {
			System.out.println(num + "은 소수입니다.");
		}
		else {
			System.out.println(num + "은 소수가 아닙니다.");			
		}
	}
}
