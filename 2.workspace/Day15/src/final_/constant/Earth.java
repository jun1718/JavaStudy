package final_.constant;

public class Earth {
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;
	//굳이 상수를 생성과 동시에 초기화 안하겠다면 static 초기화자를 사용할수 있다.
	//하지만 정말 생성과 동시에 초기화를 안할 필요가 없다. 왜냐면 그냥 final일때는
	//생성자에서 초기화를할때 객체에 따라 final의 처음저장하는 값이 변경될수 있어서 
	//선언과 동시에 초기화를 안했다지만 지금 이건 static초기화자를 사용하든 선언과동시에 초기화를
	//하든 결과가 무조건 같다. 상수가 아닌 final이라면 결과가 달라질수있어서 사용하지만 이건의미없다.
	static {
		EARTH_SURFACE_AREA = 
				4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI; 
	}
	
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : "+ Earth.EARTH_SURFACE_AREA + 
				"km^2");
	}
}
