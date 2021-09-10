package static_.method;

public class Count {
	public int a;
	public static int b;
	
	//일반메서드 선언
	public int method1() {
		a=10;
		return a+b;
	}
	//일반메서드 안에서는 일반멤버변수와 정적멤버변수를 모두 참조할수 있음
	
	//정적메서드선언
	public static int method2() {
		Count c = new Count();
		c.a=10;
		return c.a+b;
	}
	/*
	 -static method 내부에서는 static이 붙은 변수나 메서드만 참조할 수 있씁니다.
	 -static 블록 내부에서 non-static멤버를 참조하려면 객체생성을 통해 참조해야 함
	 */
}
