
public class _3ForQuiz {
	public static void main(String[] args) {
		int dan = (int)(Math.random()*8)+2;
		System.out.println("랜덤 구구단 " + dan + "단");
		System.out.println("--------------------------");
		for(int i=1;i<10;i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
}
