
public class _2AssignmentOperatorExample {
	public static void main(String[] args) {
		int a=5, b= 5;
		a+=3;  //a = a+3
		b=+ 3; //b = (+3)으로 인식되는거임
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a-= 4;
		System.out.println("============================");
		System.out.println("a : "+a);
		
		a *= 6;
		System.out.println("a : "+a);
		
		a/=5;
		System.out.println("a : "+a);
		
		a %=3;
		System.out.println("a : "+a);
	}
}
