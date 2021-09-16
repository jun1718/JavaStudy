package api.util.random;

import java.util.Random;

public class RandomExample {
	
	
	public static void main(String[] args) {
		
		//0.0이상 1.0미만의 실수 난수를리턴(Math.random()이랑 같은거임)
		Random r = new Random();
		double d = r.nextDouble();
		System.out.println("실수 랜덤값: "+d);
		//사실 이것만쓰려면 메스보다 복잡함. 메스는 스태틱메서드로 random을 가지니까 
		//객체를 안만들어도 됨
		
		//논리랜덤값을 리턴하는 nextBoolean()
		boolean b = r.nextBoolean();
		System.out.println("논리 랜덤값: "+b);
		
		//정수 랜덤값(매개변수 넣거나 안넣거나)
		//정수 int가 저장할수 있는 모든범위에서 난수를발생 -21억 ~ +21억
		int i = r.nextInt();
		System.out.println("정수 랜덤값: "+i);
		
		//전달인자로 10넣으면 0~10미만으로 출력함 즉 0~9
		i = r.nextInt(10);		
		System.out.println("0~9 랜덤값: "+i);
		System.out.println("1~10 랜덤값: "+(i+1));
	
	}
	
}
