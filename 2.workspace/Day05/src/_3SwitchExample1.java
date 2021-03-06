import java.util.Scanner;

public class _3SwitchExample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 : ");
		int point = scan.nextInt();
		
		/*
		 * switch 키워드 뒤에 나오는 변수나 연산식은 결과값이 반드시 문자나 정수타입이어야함
		 */
		switch(point/10){
 			//case 뒤에는 반드시 상수를 적어야함
		case 10:
		case 9:	//90~99
			if (point > 100) {
				System.out.println("점수잘못입력함.");
			} else {
				System.out.println("당신의 학점은 A입니다.");	
			}
			break;
		case 8:	
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6: //50 ~ 69 D
		case 5:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			System.out.println("당신의 학점은 F입니다.");
		}
		
		
		scan.close();
	}

}
