
public class _4ConditionalOperatorExample {

	public static void main(String[] args) {
		//-4~5까지의 정수 난수값 발생
		int r = (int)(Math.random()*10-4);
		
		System.out.println("-4~5까지의 정수난수값 : " + r);
		
		//3항조건연산자
		int abs = (r >=0) ? r : -r;
		System.out.println(abs);
		String s = (abs>=0) ? "성공" : "실패";
		
		System.out.println(s);
		
		double i = 2.0;
		int b = (int)i++;
		System.out.println(b);
		
		
	
	}
	
	
	
}
