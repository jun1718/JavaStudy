
public class _1MethodExample1 {
	public static int calcSum(int num){
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}//endFor
		return sum;
	}//endMethod
	public static int calcSum2(int begin, int end) {
		int sum=0;
		//short sum=0;가능 왜냐면 반환될때 int로 자동형변환되기때문임 작은놈->큰놈
		for(int i=begin;i<=end;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("1~10까지 누적합: "+calcSum(10));
		System.out.println("1~20까지 누적합: "+calcSum(20));
		int result = calcSum(100);
		System.out.println("1~100까지 누적합: "+result);
		System.out.println(0+"~"+100+"까지의 누적합: "+calcSum2(0,100));
		
	}//endMain
}//endClass
