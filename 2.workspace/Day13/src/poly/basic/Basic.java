package poly.basic;
/*
 * 하나의 클래스 파일안에 여러 클래스들을 선언할수 있다.
 * 단 파일명과 동일한 이름을 가진 클래스가 반드시 존재해야하며 해당 클래스만 public 제한자를 
 * 가질 수 있다.
 */

class A { 
//	int a;
//	public static void main(String[] args) {
//		Basic a = new Basic();
//		a.z = 4;
//	}
}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {
//	private int z = 5;
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
//	public static void main(String[] args) {
//		A a = new A();
//		a.a = 4;
//	}

//	a.a = 4; 왜 접근을못할까? p.f일텐데 public으로 해도안되고 
	
	A a1 = b;	//자식객체가 부모객체로 자동 형변환되는것이다.
	A a2 = c;	//궁금: byte->int로 변경할때는 byte 크기가 작아서 자동형변환되는건데
			//부모객체는 코드양이나 멤버변수 등 메모리공간 자체가 더 작은데 왜 자동형변환되지?
	A a3 = new D();
	A a4 = e;
	
	Object o1 = new A();	//object는 모든 클래스의 부모이기때문에 모든 객체의 형변환
		//가능
	Object o2 = new String();
}
