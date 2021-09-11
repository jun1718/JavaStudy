package final_.method;

public class Child extends Parent{

	public void method1() {
		super.method1();
		System.out.println("hi재정의완료");
	}

	public void method2() {
		super.method2();
		System.out.println("hi재정의완료");
	}
	//public void method3() {}
	//Parent의 method3는 재정의불가
	
	
	public Child() {
		method1();
		method2();
		method3();
		//재정의가 불가한거지 상속받은 method3을 얼마든지 사용가능하다.
	}
}
