package modi.cls.pac2;
import modi.cls.pac1.B;
//import modi.cls.pac1.A;	//p.f라서 import 자체도 안된다.

public class C {
	//클래스 B는 public 클래스이기때문에 다른 패키지에서도 사용가능
	B b = new B();
	
	//클래스 A는 p.f클래스이기때문에 다른 패키지에서 사용불가
	//A a = new A();
}
