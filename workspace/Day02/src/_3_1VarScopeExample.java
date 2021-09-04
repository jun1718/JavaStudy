
public class _3_1VarScopeExample {
	public static void main(String[] args) {
		//같은 타입의 변수를 선언할 때는 콤마(,)로 나열 가능
		int num1 = 10, num2 = 20;
		if (num1 > 5) {
			int num3 = num1 + num2;
			System.out.println(num3);
		}
		//int num4 = num1 + num3;
		int num3 = 5;
		
		System.out.println(num3);
	}
}

