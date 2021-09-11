package abs.goodcase;

public class Store extends HeadStore{
//	
//	Store(){
//		super();	//자식클래스의 생성자는 항상 부모클래스의 생성자를 호출할수있다.
//					//통상적으로 마지막으로 호출되는 생성자에는 반드시 super()가 있다.
//					//그럼 추상클래스의 자식이라하더라도 부모의 생성자를호출한다.
//					//그럼으로 부모의 생성자를 부모클래스에서 설계해야한다.
//	}
//	
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 2800원입니다.");
	}
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 2800원입니다.");
	}
	public void orderGrape() {
		System.out.println("포도 쥬스의 가격은 2800원입니다.");
	}
	public void orderMelon() {
		System.out.println("멜론 쥬스의 가격은 2800원입니다.");
	}
	
	@Override
	public void orderWaterMelon() {
		// TODO Auto-generated method stub
		super.orderWaterMelon();
	}
//	public void orderPeach() { //에러남 final 메서드이기때문임
//		// TODO Auto-generated method stub
//		super.orderWaterMelon();
//	}
	

}
