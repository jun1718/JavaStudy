
public class _3TextualExample {
	public static void main(String[] args) {
	
		
		//문자열을 저장할수 있는 데이터타입 String
		String s1 = "my dream";
		String s2 = "is a scientist";
		
		System.out.println("-----------------");
		System.out.println(s1);
		System.out.println(s2);
		//자바에서는 문자열의 + 연산을 진행할수 있음
		//연산결과로 문자열을 이어붙인결과를 도출함
		
		System.out.println(s1 + " " + s2);
		
		
		//문자열과 다른 데이터타입과의 + 연산
		//문자열과 다른데이터타입을할시 다른 타입을 문자열로 바꿔서 출력해줌
		//+보다 우선순위가높은 * 혹은 () / 등의 연산자가 있을시에는
		//해당 부분을 한뒤 문자열로 바꿔서 출력되어짐
		
		System.out.println(100 + 200);
		System.out.println(100 + "200");	
		System.out.println(10 + 20 + "hello");
		System.out.println("hello" + 10 + 20);
		System.out.println("hello" + (10 + 20));
		System.out.println("hello" + 10 * 20);
		System.out.println('A' + "hello");
		
		
		//기본데이터 타입의 연산시 바이트가 큰쪽에 맞추어 연산
		//문자형 데이터타입과 문자형데이타입, 문자형데이터타입과 int형데이터
		//타입의 +연산자 : 문자형은 +연산자가 올시 아스키코드상에 10진수에해당하는
		//숫자로 변경 
		System.out.println('A' + 'B');
		System.out.println('A' + 10);
		System.out.println(100L + "2"); //문자열은 예외인듯
		
		
		
	}
}
