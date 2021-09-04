import java.util.Scanner;

public class _1MethodExample3 {
	public static int add(int n1, int n2) {
		return n1 + n2;
	}//add
	public static int[] totalOperate(int n1, int n2){
		int[] total= {n1+n2,n1-n2,n1*n2,n1/n2};
		return total;
	}//totalOperate
	public static void callMyName(String name) {
		if(name.length()<2) {
			System.out.println("이름은 2글자 이상으로 입력하세요!");
			return;
		}
		System.out.println("내 이름은 "+name+"입니다.!!");
	}//callMyName
	
	public static void main(String[] args) {
		int r = add(3,5);
		System.out.println(r);
		
		int r2=add(add(4,6), add(8,7));
		System.out.println(r2);
		
		int[] tot=totalOperate(30,5);
		System.out.println("30 + 5 = "+tot[0]);
		System.out.println("30 - 5 = "+tot[1]);
		System.out.println("30 * 5 = "+tot[2]);
		System.out.println("30 / 5 = "+tot[3]);
		callMyName("리덕화");
		
		System.out.println("---------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		callMyName(name);
	}//main
}//class
