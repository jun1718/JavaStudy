
public class _7BitOperating {
	public static void main(String[] args) {
		byte a = 5; // 0000 0101
		byte b = 3; // 0000 0011
					// 0000 0001 1
					// 0000 0111 7
					// 0000 0110 6
		//비트곱(and)
		System.out.println(a & b);
		
		//비트합(or)
		System.out.println(a | b);
		
		//배타적 논리합 연산(xor)
		System.out.println(a ^ b);
		
		//비트 이동연산자(<<,>>)
		int i = 192;
		System.out.println(i << 3);
		System.out.println(i >> 3);
	}
}
