package modi.protec.pac2;
import modi.protec.pac1.A;

public class D extends A{
	public D() {
	
		super();
		super.s = "hi";
		super.method();
		
		//만약 A클래스의 생성자와 멤버변수, 메서드가 모두 protected가 아니라 
		//private나 p.f라면 super로도 접근불가하다. 애초에 p.f보다 더 완화된 규정이라생각하면편함
		
		/*
		 * protected 제한자는 패키지가 다를경우 두클래스사이에 상속관계가 있다면 super를 통한
		 * 참조를 허용합니다.
		 */
//		A a = new A();
//		a.s = "hi0";
//		a.method();
	}
}
