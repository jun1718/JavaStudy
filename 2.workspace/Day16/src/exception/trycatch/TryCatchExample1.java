package exception.trycatch;

public class TryCatchExample1 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;	//0이면 반드시 에러남 즉 에러가능성이있는코드라서 예외 가능성이있다고함			
		
		System.out.println(i*j);
		try {
			System.out.println(i/j);
			//예외가 발생한곳에서 바로 catch로 가기때문에 아래 코드 실행안됨
			System.out.println("예외 발생시 이 텍스트는 출력되지 않음");
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println(i+j);
		System.out.println(i-j);
	}
}
