package static_.method;

public class MainClass {

	public static void main(String[] args) {
		/*
		 -static이 붙은 멤버는 개체 생성없이 클래스 이름으로 직접참조가능
		 */
		System.out.println(Count.method2());
		Count.b +=50;
		System.out.println(Count.method2());
		Count.b +=20;
		System.out.println(Count.method2());

	}

}
