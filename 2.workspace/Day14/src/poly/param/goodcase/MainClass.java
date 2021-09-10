package poly.param.goodcase;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver kim = new Driver();
		Ferrari f = new Ferrari();
		
		kim.drive(f);
		
		Sonata s = new Sonata();  //이렇게하면 kim.drive(s)가 안되는 문제가있다.
									//드라이버에 매개변수에 오버로딩해야함
								//하지만 차종류 300만대가 넘어가면 오버라이딩도 300만번
								//넘많음 ㅠㅠ 비효율적임 그래서 다형성을 사용한다!
		
		kim.drive(s);
		
	}

}
