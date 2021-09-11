package static_.init;

public class Computer {
	public static String company = "LG";
	public static String model = "gram";
	public static String info;
	public int price;
	
	public Computer() {
		System.out.println("생성자 호출!");
		this.price = 1000000;
		this.info = company + "-" + model;
		//스태틱변수를 사용할때는 생성자가 생성안될수있으니 생성자로 초기화를하면안된다.
	}
	//정적변수의 초기화를 위해서는 정적 초기화자를 이용해야한다.
	static { // 정적초기화자
		System.out.println("정적 초기화자 호출!");
		info = company + "-" + model;
		//price = 10; //스태틱변수만 사용가능
		//정적초기화자 생성시기: 클래스를 로딩시킬때 딱 한번 호출됨. 그후엔 호출할수없음
				//생성자와다르게 호출불가 생성자또한 생성시 1번호출되긴하지만 
				//그 한번일때 본인들끼리 호출을 할수있다.
		//클래스 로딩방법: 여러개가있지만 둘중 하나만 있어도 정적초기화자 작동됨
		//1.객체를 생성
		//2.클래스이름을 통해 정적멤버에 접근
	}
	
}
