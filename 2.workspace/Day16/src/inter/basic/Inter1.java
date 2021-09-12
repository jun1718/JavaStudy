package inter.basic;

public interface Inter1 {
	//인터페이스에 변수를 서언하면 자동으로 상수 취급한다.
	//디폴트값이 상수라는 뜻
	public static final double INCH = 2.54;
//	double HI = 3.4;
	
	//인터페이스에 메서드를 선언하면 추상메서드로 취급됨
	//즉 객체를 만들수없다. 다형성을 만들기위한 거기때문에 그럼
	abstract void method1();
//	void method2();
}
