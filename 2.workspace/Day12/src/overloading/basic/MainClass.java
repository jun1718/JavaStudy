package overloading.basic;

public class MainClass {

	public static void main(String[] args) {
		Basic b = new Basic();
		b.input(5);
		b.input("하이");
		b.input(5,10);
		b.input(3.14,"하하");
		
		System.out.println();
	}

}
