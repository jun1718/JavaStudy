package overloading.basic;
/*
 * 오버로딩(중복)-하나의 클래스 내부에 같은 이름을 가진 메서드를 여러개 선언할수 있게하는 문법
 * 	-부모꺼를 오버로딩할순 없는가?
 * 1.매개변수의 데이터타입이 달라야함
 * 2.매개변수의 순서가 달라야함
 * 3.매개변수의 개수가 달라야함
 */
public class Basic {
	void input(int a) {
		System.out.println("정수 1개가 입력됨");
	}
	void input(int i, int j) {
		System.out.println("정수 2개가 입력됨");
	}
	void input(String s) {
		System.out.println("문자열 1개가 입력됨");
	}
	void input(String s, double d) {
		System.out.println("문자열 1개, 실수형 1개가 입력됨");
	}
	void input(double x, String d) {
		System.out.println("실수형 1개, 문자열 1개가 입력됨");
	}
}
