package exception.throw_;

public class ThrowExample {
	public static int calcSum(int n) throws Exception{
	/*
	 * 프로그램이 throw구문을 만나는 순간 즉시 예외를 강제로 발생시키게 되며
	 * 해당 예외를 처리해줄 catch블록을 검색합니다.	
	 * throw가 메서드 내에 포함되는 순간 반드시 해당 메서드는 throws를 붙여야한다.
	 * 의식흐름: 야 이건 우리안에서 에러를 발생시키는건데 만약에 밖에서 try처리를 안해주면
	 * 우리때매 프로그램터지잖아!! 그러니까 안전빵으로 밖에서 try안하면 우리 사용도못하도록
	 * throws붙이자 안붙였다가 징계먹을수도있어!
	 */
		if(n<=0) {
//			System.out.println("매개값을 양수로 전해주세요");
			throw new Exception(); // 프로그램은 에러라생각하지않지만 개발자는에러라고
			//생각하는 상황에서 개발자가 강제로 에러를 발생시키는 것이 throw다.
		}
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		try {
			int a = 2;
			System.out.println("성공!");
		} catch(Exception e) {
			System.out.println("에러가발생할수있는코드라했는데 발생하지 않는코드가 문제는 안생기네");
		}
		
		try {
			int result1 = calcSum(100);
			System.out.println("1~100까지의 누적합 : " + result1);
			
			int result2 = calcSum(-100);	//음수가 나오면안되는데 나와서 값이 0이됨
			//설계자의의도 n은 양수만와야함
			System.out.println("1~100까지의 누적합 : " + result2);			
		} catch(Exception e) {
			System.out.println("매개값을 양수로 전달해주세요.");
		}
		
	}
}
