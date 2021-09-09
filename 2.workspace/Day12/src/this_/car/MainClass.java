package this_.car;

public class MainClass {
	public static void main(String[] args) {
		Car myCar1 = new Car("람보르기니 아벤타도르");
		Car yourCar = new Car("아반떼 스포츠");
		
	
		myCar1.run(250);
		System.out.println("==============================");
		yourCar.run(130);
	}
}
