
public class _1Object_Basic1 {
	static int result1 = 0;
	static int result2 = 0;
	static int result3 = 0;
	public static int add1(int n) {
		result1 += n;
		return result1;
	}
	public static int add2(int n) {
		result2 += n;
		return result2;
	}
	public static int add3(int n) {
		result2 += n;
		return result2;
	}
	public static void main(String[] args) {
		System.out.println("1번 계산기 계산결과!");
		System.out.println("=======================");
		System.out.println(add1(6));
		System.out.println(add1(14));
		System.out.println(add1(140));
		
		System.out.println("2번 계산기 계산결과!");
		System.out.println("=======================");
		System.out.println(add2(64));
		System.out.println(add2(10));
	}
}
