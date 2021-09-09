package modi.constructor.pac1;

public class B {
	A a1 = new A(false); //같은 패키지 클래스의 생성자에대한 public 제한자
	A a2 = new A(55);	//같은 패키지 클래스의 생성자에대한 p.f 제한자
	//A a3 = new A("hi"); //같은 패키지 클래스의 생성자에대한 private제한자
	
	
}
