
public class _4UnaryExample {
	public static void main(String[] args)
	{
		//증감연산자 ++, --
		int i = 1;
		int j = i++; //후위연산자
		
		System.out.println("i의 값 : " + i);
		System.out.println("j의 값 : " + j);
		System.out.println("-------------------");
		
		int x = 1;
		int y = ++x; //전위연산자
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
	}
}
