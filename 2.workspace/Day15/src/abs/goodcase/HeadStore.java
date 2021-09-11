package abs.goodcase;

public abstract class HeadStore {
	HeadStore(){
		System.out.println("HEADStore생성자호출!");
	}
	/*
	 1.메서드에 abstract를 붙이면 해당 메서드는 추상메서드가 되며 이 메서드는 상속을 통해 자식 클래스에서
	 반드시 오버라이딩을 해야함. 그렇지 않으면 에러가 발생함
	 2.추상메서드는 실체가 존재하지 않는 메서드의 틀 역할을 하기때문에 메서드의 바디부분 {}이 없고 세미클론
	 으로 선언을 마감함.
	 3.일반 클래스에서는 추상메서드를 선언할수 없음 추상메서드가 하나라도 존재하는
	 	클래스는 반드시 추상클래스가 되어야함
	 4.추상클래스 내부에서는 추상메서드만을 선언할 필요는 없습니다.
	 	일반메서드도 모두 선언할수 있습니다.
	 */
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderGrape();
	public abstract void orderMelon();//가격 재정의 안하면 에러
	
	public void orderWaterMelon() {//가격 재정의 안해도 에러안남
		System.out.println("수박 쥬스의 가격은 4000원입니다.");
	}
	public final void orderPeach() {//가격재정의 불가
		System.out.println("복숭아의 가격은 2000원입니다.");
	}
}
