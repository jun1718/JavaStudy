package exception.multy;

import java.util.Scanner;

public class MultiCatchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("1번째 데이터: ");
			String data1 = sc.next();
			System.out.print("2번째 데이터: ");
			String data2 = sc.next();
			
			
			//NumberFormat 발생가능
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			//Arithmetic 발생가능
			int result = val1/val2;
			System.out.println(val1 + " / " + val2 + " = " + result);
			
			
			String str = null;
			str.charAt(0);
			
			//exception 클래스는 모든 예외를 일괄처리할 수 있음 다형성임
			//그래서 모든녀석 Exception이라해도되는데 다중처리를 할때는 자식클래스명칭을
			//명확하게 적어야함
		} catch(NumberFormatException e) {
			System.out.println("데이터를 숫자만 넣어주세요.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");			
		} catch(Exception e) { //이거 if else if else처럼 나머지는 마지막에둬야함
			System.out.println("알수 없는 예외 발생!");//하나 처리하면 나머지케치발동x
			System.out.println("신속히 처리하겠습니다!");			
		} finally {
		
			sc.close();
		}
		
		System.out.println("프로그램 정상종료!");
	}
}
