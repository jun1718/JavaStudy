package abs.goodcase;

public class MainClass {
	public static void main(String[] args) {
		//HeadStore h = new HeadStore();//HeadStore타입으로 객체를 구체화불가하다
									//는 문구와 함꼐 에러남 -> 추상클래스이니까^^
		//추상클래스는 스스로 객체생성불가(꿈을 객체로 만들지못함)
		//반드시 상속을통해 클래스를 구체화시켜야함(설계가 안끝났는데 어떻게 객체를 만들겠냐~)
//		Store s = new Store();
		HeadStore s = new Store();
		s.orderApple();
		s.orderWaterMelon();
		s.orderPeach();
		//다형성기능 사용가능, 객체를 만드는것만 불가능하지 추상클래스로 다형성기능인 프로모션가능
		
	}
}
