
public class Phone {
	String color;
	String model;
	int price;
	/*
	 * 생성자: 생성자는 객체가 실행될때 실행해야할 로직을 작성할수있음
	 * 생성자는 선언해야만 호출할수 있으며 생성자를 하나도 선언하지 않을경우 자동으로 기본생성자가
	 * 만들어짐
	 */
	//생성자선언:생성자의 이름은 크랠스 이름과 대/소문자까지 같아야함
	//그리고 반환유형은 적지않음
	
	Phone(){
		//System.out.println("생성자 출력!");
		color = "회색";
		model = "애니콜";
		price = 500000;
		//PhoneMain에서 전달인자없이 객체생성할경우  자동입력됨
	}
	
	
	/*
	 * 생성자 오버로딩
	 * 1.생성자는 중복해서 여러개선언가능
	 * 	--단 매개변수의 종류나 갯수가 달라야함
	 */
	Phone(String pColor){
		//System.out.println("생성자 출력!");
		color = pColor;
		model = "카이";
		price = 250000;
		//PhoneMain에서 전달인자없이 객체생성할경우  자동입력됨
	}
	
	void info() {
		System.out.println("========핸드폰정보==========");
		System.out.println("색상: "+color);
		System.out.println("모델명: "+model);
		System.out.println("가격: "+price);
		System.out.println("=========================");
	}
}
