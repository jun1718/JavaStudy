import java.util.Arrays;
import java.util.Scanner;

public class _4SwitchQuiz {
	public static void main(String[] args) {
		
		System.out.println("직급을 입력하세요.");
		System.out.println("[사원, 대리, 과장, 차장, 부장]");
		System.out.print("> ");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		switch(name){
		case "사원":
			System.out.println(name+"의 직급은 100만원입니다.");
			break;
		case "대리":
			System.out.println(name+"의 직급은 200만원입니다.");
			break;
		case "과장":
			System.out.println(name+"의 직급은 300만원입니다.");
			break;
		case "차장":
			System.out.println(name+"의 직급은 400만원입니다.");
			break;
		case "부장":
			System.out.println(name+"의 직급은 500만원입니다.");
			break;
		default:
			System.out.println(name+"은(는) 없는 직급입니다.");
			System.out.println("직급을 다시 입력해주세요.");
		}
	}//end main
}//end class
