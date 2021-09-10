package static_.field;

public class MainClass {
	public static void main(String[] args) {
		Count c1 = new Count();
//		c1.a = 4;
//		c1.b = 5;	에러는 아니지만 경고가뜸 즉 정적멤버변수로 접근할때는 클래스로 접근하는것을 권장
		//Count.b = 6;
		
		
		
		c1.a++;
		c1.b++;
		System.out.println("a : "+c1.a+ "b : "+c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("a : "+ c1.a++ + "b : "+c1.b);
		
		
		//static멤버는 객체와 무관하기때문에 클래스명을 참조하여 사용 객체x
		
		Count.b++;
		Count.b++;
		

	
		System.out.println(c1.b);
		System.out.println(c2.b);
		
	}
}
