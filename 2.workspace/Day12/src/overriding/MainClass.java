package overriding;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		Child c = new Child();
		c.method3();
		c.method1();
		c.method2();
	}
}
