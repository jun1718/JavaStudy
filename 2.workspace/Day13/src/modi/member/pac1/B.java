package modi.member.pac1;

public class B {
	public B() {
		A a = new A();
		
		a.a = 1;	//public
		a.b = 2;	//p.f
		//a.c = 3;	//private
		
		
		a.method1();
		a.method2();
		//a.method3();	//private
	}
	
}
