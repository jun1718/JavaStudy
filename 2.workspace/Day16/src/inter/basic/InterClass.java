package inter.basic;

/*
 * 1.인터페이스를 사용하려면 클래스에서 해당 인터페이스를 구현해야 함.
 * 2.인터페이스를 구현하는 키워드는 implements임
 * 3.인터페이스를 상속과 달리 여러 인터페이스들을 동시에 다중구현할수있음
 * 4.인터페이스를 구현할때 인터페이스 내부에 선언된 추상메서드들을 반드시 전부 재정의해야함
 */

public class InterClass implements Inter1, Inter2{
	public void method1() {
		System.out.println("Inter1의 메서드구현");
	}
	public void method2() {
		System.out.println("Inter2의 메서드구현");
	}
	public void method3() {
		System.out.println("클래스의 메서드호출!");
	}
}
