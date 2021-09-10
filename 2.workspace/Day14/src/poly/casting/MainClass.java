package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		//promotion이 적용되면 자식클래스의 본래멤버를 참조할 수 없음
		Parent p = new Child();
		p.method1();
		p.method2();
//		p.method3();
		System.out.println("-----------------------");
		
		Child c = (Child)p;
		c.method3();
		
		/*
		 * 한번 promotion이 일어난 객체를 대상으로 강제타입변환을 사용할수있음
		 */
//		Child ccc = (Child)new Parent(); //parent를 만들고 child로 바꾼거임 이럼에러
	}

}
