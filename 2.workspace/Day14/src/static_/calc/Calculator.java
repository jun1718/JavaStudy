package static_.calc;

public class Calculator {
	
	/*
	 -계산기별로 색깔이 다를수 있기때문에 color같은 변수는 데이터를 공유시켜서는 안됨
	 -하지만 pi같은 원주율값은 계산기마다 동일하기때문에 공유해서 사용하는것이 더 바람직함
	 */
	public String color;
	public static double Pi;
	
	/*
	 -일반 멤버변수를 사용하고있는 메서드는 정적메서드로 선언하면 안됨
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public static double areaCircle(int r) {
		return r* r* Pi;
	}
	
}
