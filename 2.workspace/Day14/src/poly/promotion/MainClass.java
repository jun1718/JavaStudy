package poly.promotion;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent();
		p1.method1();
		p1.method2();
		
		System.out.println("----------------");
		
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		
		Parent p2 = c1;	//Child->Parent : promotion(자동형변환)
		System.out.println(c1==p2);
		
		p2.method1();
		p2.method2();	//parent가 아니라 Child의 메서드가 나온다.
//		p2.method3();	//본인건데 안써짐 부모한테 물려받은거만 써지는데 이러면 소용이없다.
					//그래서 다음 부분에서 방법이나온다.
	}

}
