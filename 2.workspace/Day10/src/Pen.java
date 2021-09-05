
//설계용 클래스(라이브러리 클래스)는 메인메서드를 작성하지 않는다.
public class Pen {
	//객체의 속성을 나타내는것을 필드(멤버변수)라고 부름
	String color;
	int price;
	
	//객체의 기능을 나타내는 것을 메서드(멤버함수)라고 부름
	void write() {
		System.out.println(color + "색 글을 씁니다.");
	}
	
	void info() {
		System.out.println("----------pen's Info------------");
		System.out.println("색상: "+color);
		System.out.println("가격: "+price);
		//배열은 동종모음구조라 지금처럼 여러 형태의 데이터를 저장불가능하며 기능함수를
		//묶을수없다.
		
		
	}

}
