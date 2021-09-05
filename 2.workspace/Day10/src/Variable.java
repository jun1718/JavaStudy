
public class Variable {
	//필드(멤버변수) 선언.
	int a; //초기화하지 않으면 기본값으로 자동 초기화
	
	//메서드 선언
	void printNumber(int c) {
		//지역변수 b와 매개변수 c를 선언
		int b=0;
		
		System.out.println("멤버변수: "+a);
		System.out.println("지역변수: "+b); //멤버, 매개는 초기화안되어있어도
										//출력등 사용가능한데 지역변수는 반드시
								//초기화해야 출력가능하다. 멤버나 매개는 밖에서
								//들어올것을 알기때문이다.
								//멤버변수는 초기화하지 않아도 기본값으로 자동초기화된다
								//매개는 반드시 밖에서 들어온다
		System.out.println("매개변수: "+c);
		
	}
	
	public static void main(String[] args) {
		Variable  v = new Variable();
		v.printNumber(5);
	}
}
 