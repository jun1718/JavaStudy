
public class _1FloatExample {
	public static void main(String[] args) {
		float f1 = 7.12345F;
		double d1 = 7.12345;
		System.out.println(f1);
		System.out.println(d1);
		
		
		float f2 = 1.234567891234F;
		double d2 = 1.234567891234;
		
		
		System.out.println(f2);
		System.out.println(d2);
		
		double d0 = 1.234567890123456789; //왜 16자리까지나오지
		System.out.println(d0);
		
		
		
		
		float f3 = 3.1415e6F; // 3.1415 x 10^6을 뜻함
								//지수식표현법 (크기를쉽게비교)
								//10을 e로 나타냄
								//3141500
		double d3 = 2e-3; // 2.213 x 10^-3
		
		System.out.println(f3);
		System.out.println(d3);
	}
}
