import java.util.Scanner;

public class _1DoWhileExample {
	public static void main(String[] args) {
		//정수를 입력받아 1부터 입력받은 숫자까지의 누적합을 구하는 로직
		Scanner scan = new Scanner(System.in);
		System.out.print("정수: ");
		int target = scan.nextInt();
		int sum = 0;
		int n=1;
		
//		while(n<=target) {
//			sum+=n;
//			n++;
//		}
//		System.out.println("1부터 " + target + "까지의 누적합계  : " + sum);
		
		do {
			sum += n;
			n++;
		}while(n<=target);
		
		System.out.println("1부터 " + target + "까지의 누적합계  : " + sum);
	}
}
