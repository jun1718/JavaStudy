import java.util.Scanner;

public class _2LoopQuiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee=5;
		
		while(true) {
			System.out.print("돈넣어라 : ");
			int money=scan.nextInt();
			if(money<500) {
				System.out.println("500원이상넣어라");
			}else if(money==500){
				System.out.println("커피를 한잔드리겠습니다.");
				coffee--;
				System.out.println("남은 커피 : " + coffee + "잔");
				if(coffee==0) {
					System.out.println("음료수가 다떨어졌습니다. 판매를 중지합니다.");
					break;
				};
			}else if(money>500){
				System.out.println("커피를 한잔드리겠습니다.");
				coffee--;
				money-=500;
				System.out.println("남은 커피 : " + coffee + "잔");
				System.out.println("잔돈 : " + money + "원입니다.");
				if(coffee==0) {
					System.out.println("음료수가 다떨어졌습니다. 판매를 중지합니다.");
					break;
				};
			}
		}
	}
}