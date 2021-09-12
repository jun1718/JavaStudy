package inter.basic;

public class MainClass {

//	public static final int a = 4;
	public static void main(String[] args) {
		//인터페이스는 객체를 생성할 수 없음
//		Inter1 i = new Inter1();
		InterClass ic = new InterClass();
		
		System.out.println(Inter1.INCH);
		System.out.println(Inter2.ABC);
//		System.out.println(ic.INCH);	//객체로도 접근가능하지만 저둘은 상수처리되었으니
//		System.out.println(ic.ABC); 	//객체가없어도 만들수있음으로 공용성있게 inter
										//face를 이용해서 호출한다.
										//즉 상수들을 모아놓고 사용할때 유용하게 취급됨
		System.out.println(ic.INCH);
		//ic.INCH; 이렇게 sys없이 선언만 해두면 에러남 상수특징인가?> 실험해보니 특징인듯(a)
		
//		System.out.println("a");
		
		ic.method1();
		ic.method2();
		ic.method3();

		/*
		 * -인터페이스 이름도 하나의 타입으로 취급가능
		 * -인터페이스를 통해 상속 없이도 다형성 구현 가능
		 * 	원래다형성 뜻 : 부모클래스의 타입을 자식객체가 사용할수있다.
		 */
		
		Inter1 i1 = ic;
		Inter2 i2 = new InterClass();
		
		
		i1.method1();
//		i1.INCH;
		i2.method2();
//		i2.ABC;
		
//		i2.method1();
//		i2.method3();
//		i2.INCH;
		
		
		InterClass icc = (InterClass)i1;
		InterClass icc2 = (InterClass)i2;
		
		icc.method1();
		icc.method2();
		icc.method3();
		icc2.method1();
		icc2.method2();
		icc2.method3();
		
		
		
	}

}
