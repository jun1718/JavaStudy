
public class _8CastingExample2 {
	public static void main(String[] args) {		
		int i = 45422;	
		//char c = i; //에러, 즉 자동형변환 불가
		char c = (char)i;	//명시적 형변환
							//i가  char가 가지는 표현범위 내에서 있어야 제대로 작동함
							//(0~65535)
		System.out.println("72의 유니코드문자: " + c);
		
		double d = 4.83123;
		int j = (int)d;
		System.out.println(j);
		
		int k = 1000;	//byte의 표현범위인 -128~127을 넘는 수기에 에러
		//int k = 127;
		byte b = (byte)k;
		System.out.println(b);
	}
}

