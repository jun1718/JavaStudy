import java.util.Scanner;

public class _5ScannerExample {
	public static void main(String[] args) {
		//1.스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		//2.스캐너 클래스가 가지고 있는 입력메서드들을 사용하여 데이터를 입력받음
		
		
		System.out.println("이름을 입력하세요.");
		System.out.print("> ");	//println하면 안됨
		String name = scan.next();
		
		System.out.println("나이를 입력하세요.");
		System.out.print("> ");
		int age = scan.nextInt();
		
		String a = "hji";
		
		
		System.out.println("------------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		
		scan.close();
	
	}
}
