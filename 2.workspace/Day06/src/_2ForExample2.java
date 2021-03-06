
public class _2ForExample2 {
	public static void main(String[] args) {
		//7~100까지의 정수중 7의 배수를 모두 가로로 출력
		for(int i=7; i<101; i++) {
			System.out.print(i+ " ");
		}
		System.out.println("\n--------------------");
		
		//1~100가지의 정수중 6의 배수를 모두 가로로 출력
		for(int i = 1; i < 101; i++) {
			if(i%6==0) {
				System.out.print(i + " ");
			}			
		}
		System.out.println("\n--------------------");
		
		//1~100가지 정수중 8의 배수이면서 동시에 16의 배수가 아닌수를 모두 가로로 출력
		for(int i=1;i<101;i++) {
			if(i%8==0 && i%16!=0)
				System.out.print(i + " ");
		}
		System.out.println("\n--------------------");
		
		//1~850까지의 정수중 9의 배수의 개수를 출력
		int n=0;
		for(int i=1;i<851;i++) {
			if(i%9==0)
				n++;
		}
		System.out.println("9의 배수의 개수: " + n);
	}
}
