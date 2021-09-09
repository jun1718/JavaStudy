package modi.constructor.pac2;
import modi.constructor.pac1.*;	//다른 패키지의 클래스를불러오려하는데
			//그 클래스의 AB모두 public이라서 import 가능하다. 만일 p.f라면 안된다.

public class C {
	A a1 = new A(true);
	//A a2 = new A(23);	
	//A a3 = new A("하이");
}
