
public class _1LogicalOperator {
	public static void main(String[] args) {
		int x = 10, y = 20;
		if ((x!=10) & (++y == 21)) {
			System.out.println("연산결과가 참입니다.");
		}
		else {
			System.out.println("연산결과가 거짓입니다.");
		}
		System.out.println("x: " + x + " y: " + y);
		
		if ((x==10)|(++y==21)) {
			System.out.println("연산결과가 참입니다.");
		}
		else {
			System.out.println("연산결과가 거짓입니다.");
		}
		System.out.println("x: " + x + " y: " + y);
		
		
		int a = 10; int b =20;
		if ((a!=10) && (++b == 21)) {
			System.out.println("연산결과가 참입니다.");
		}
		else {
			System.out.println("연산결과가 거짓입니다.");
		}
		System.out.println("a: " + a + "b: " +b);
		
		if ((a==10)||(++b==21)) {
			System.out.println("연산결과가 참입니다.");
		}
		else {
			System.out.println("연산결과가 거짓입니다.");
		}
		System.out.println("a: " + a + "b: " +b);
		
	}
}
