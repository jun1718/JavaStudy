package modi.cls.pac1;
/*
 * public 제한자는 접근제한이 없는 형태(어디에서나 접근가능)
 */
public class B {
	/*
	 * 클래스 a의 접근제한자가 p.f이기 때문에 같은 패키지에 있는 클래스 B에서는 A를 사용할수 있음
	 */
	A a = new A();
}
