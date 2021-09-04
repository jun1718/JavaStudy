
public class _4IntegerExample {
	public static void main(String[] args) {

		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 2147483648L;
		
		System.out.println(d);
		//2진수 저장시에 정수 앞에 접두어로 0b를 붙임
		int bin = 0b1010;
		System.out.println("2진수 1010: " + bin);

		//8진수 저장시에 정수 앞에 접두어로 0b를 붙임
		int oct = 064;
		System.out.println("8진수 64 : " + oct);
		
		//16진수 저장시에 정수 앞에 접두어로 0x를 붙임
		int hex = 0x3a4c;
		System.out.println("16진수 3a4c : " + hex);
		
		
	}
}
