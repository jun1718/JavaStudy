package modi.member.pac1;

public class A {
	public int a;
	int b;
	private int c;
	
	public A() {
		a=1;
		b=1;
		c=1;
		
		method1();
		method2();
		method3();
	}
	
	//메서드선언
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	/*
	 * 변수의 사용 또는 메서드의 호출은 메서드 내부혹은 생성자에서만 가능하다.
	 * 변수의 생성은 메서드 내부가 아니어도됨
	 * 즉 변수나 메서드는 생성만 외부에서 가능하고 사용은 모두 생성된 메서드내부에서해야한다.
	 */
}
