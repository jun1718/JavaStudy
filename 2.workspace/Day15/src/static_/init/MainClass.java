package static_.init;

public class MainClass {

	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println(com.info);
		//System.out.println(Computer.info);
		//스태틱변수를 사용할때는 생성자가 생성안될수있으니 생성자로 초기화를하면안된다.
		//정적변수의 초기화를 위해서는 정적 초기화자를 이용해야한다.
		//객체를 만드는순간 정적초기화자가 가장먼저 호출되고 그다음 생성자
		

	}

}
