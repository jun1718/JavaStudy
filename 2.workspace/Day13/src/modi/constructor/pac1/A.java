package modi.constructor.pac1;

public class A {
	//멤버변수 선언
	A a1 = new A(true);	//public 생성자 호출
	A a2 = new A(3);	//p.f
	A a3 = new A("hi");	//private	여기는 자신클래스니까 접근제한자가 뭐든간에사용가능
	
	//생성자 선언
	public A(boolean b) {	//생성자의 public 제한
		
	}
	
	A(int i) {} //생성자의 p.f 제한
	private A(String s) {} //생성자의 private 제한
}
