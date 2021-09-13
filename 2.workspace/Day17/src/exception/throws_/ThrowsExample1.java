package exception.throws_;

public class ThrowsExample1 {
	public static String[] greetings = {"안녕", "니하오", "헬로"};
	public static void main(String[] args) {
		/*
		 * thorws가 붙어 있는 메서드나 생성자를 호출할때는 반드시 try블록 내부에서 호출하여
		 * 예외처리를 진행해야함
		 * 또는 다시 throws하여 예외처리를 다시 한 번 떠넘길수 있음
		 */
		try {			
			greet(3);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("안녕");
			/*
			 * printStackTrace()는 예외발생 경로를 추적하는 메시지를 출력함
			 * 주로 개발과정에서 예외의 원인을 찾을때 유용하게 사용함
			 */
		}
		
		System.out.println("프로그램 정상종료!!");
		
		
	}
	/*
	 * 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우 예외 처리를 메서드
	 * 호출자에게 떠넘기는 방식을 throws라 함
	 * 메서드나 생성자 호출 시 예외처리를 강요하고 싶을 때 사용합니다.
	 */
	public static void greet(int index) throws Exception{
		//내부에서 에러가나면 내가 잘못한게아니고 호출부에서 잘못이 있는거니까 
		//너 무조건 try해라  try안하면 나못쓴다. 
		//난 호출부의 상황에 따라 에러가 날 가능성이 높다. 그러니 안전하게 try안하면 안시켜준다.
//		try {
//			System.out.println(greetings[index]);
//		} catch(Exception e) {
//			System.out.println("배열의 참조범위를 벗어남!");
//		}
		System.out.println(greetings[index]);	
	}
}
