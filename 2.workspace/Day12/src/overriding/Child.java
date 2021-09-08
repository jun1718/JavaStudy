package overriding;

public class Child extends Parent{
	/*
	 * a메서드 재정의
	 * 부모클래스가 물려준 메서드를 자식클래스에서 블록내부만 바꿔서 사용하는것
	 */
	void method3() {
		System.out.println("자식의 3번메서드 호출!");		
	}
	void method2() {
		System.out.println("재정의된 자식의 2번 메서드 호출!");
	}	
}
