package static_.singleton;

public class Singleton {
	/*
	 -싱글톤 패턴 : 객체의 생성을 1개로 제한하기 위한 디자인 패턴
	 1.외부에서 이 클래스의 객체를 생성할수 없도록 생성자를 단 1개만 선언하고 private 제한을 붙임
	 */
	int a;
	
	private Singleton() {}
	
	/*
	 2.자신의 클래스 내부에서 스스로의 객체를 1개 생성
	 */
	
	private static Singleton instance = new Singleton();
	/*
	 3.외부에서 이 클래스의 객체 생성을 요구할 경우 2번에서 미리 만들어둔 단 하나의 객체를 공개된 메서드를
	  통해 제공함
	 */
	
	public static Singleton getInstance() {
		return instance;
	}
	
	/*
	4.static화 및 접근제한 
	 외부에서 만들어진 객체를 사용할수있도록 공개된 메서드를 통해 제공하지만 결국 객체가 안만들어지면
	 	못만든다. 그래서 static을 붙이면 객체를안만들고도 클래스의 메소드에 접근가능하고 그 메소드에는
	 	클래스에서 만들어놓은 단 하나의 객체를 참조하는 참조변수가 있으니 그것으로 객체를 사용할수있다.
	 	하지만 그 반환하는 객체또한 private static으로 해주어야한다.
	 	static내부에선 static으로만 직접적으로 사용할수있고 간접적으로 사용하려면 내부에 객체를
	 	만들어서 하는 방법도 있지만 getInstance라는 메소드의 기능적인측면에서 내부에 객체까지 생성
	 	한다는것은 부자연스러움으로 외부에 따로 생성한다.
	 	private는 함부러 instance에 접근하지 못하도록 하기위한 조치이다.
	 */
}
