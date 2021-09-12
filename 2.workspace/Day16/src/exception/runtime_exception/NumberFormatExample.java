package exception.runtime_exception;

public class NumberFormatExample {
	public static void main(String[] args) {
		String a = "15";
		String b = "13";
		
		System.out.println(a+b);
		
		//문자열 수치변환
		//str -> int 변환
		//Integer.parseInt(문자열) 메서드 이용
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i+j);
	
		
		//parseInt는 문자열 내부에 순수한 정수가 들어있어야만 변환을 실행하며  정수값이 아닐
		//경우 NumberFortmatException이 발생함
		
		String str = "hello";
//		int e = Integer.parseInt(str);	//에러
		
		
	}
}
