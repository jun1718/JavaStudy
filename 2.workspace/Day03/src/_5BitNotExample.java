
public class _5BitNotExample {
	public static void main(String[] args) {
		//비트반전 연산자(~)
		/*
		 * 정수의 2진수값의 각자리수를 반전시킴
		 * 0 -> 1, 1 ->0
		 */
		
		byte b = 8;	//0000 1000  1111 0111 -9
		//0000 1001 9
			//-128 ~ 127 
		System.out.println(~b);
		//논리반전 연산자(!)
		//ture -> false, flase -> true
		boolean bool = false;
		System.out.println(!bool);
	}
}
