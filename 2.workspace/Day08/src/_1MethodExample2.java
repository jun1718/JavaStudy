
public class _1MethodExample2 {
	public static void main(String[] args) {
		System.out.println(calcSum());
		System.out.println(calcSum());
		System.out.println(calcSum());
		System.out.println(calcSum());
		System.out.println("이번에 획득한 무기: "+randomWeapon());
	}
	
	public static int calcSum() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		return sum;
	}
	public static String randomWeapon() {
		double d=Math.random();
		if(d>0.66) return "단검";
		else if(d>0.33) return "장궁";
		else return "지팡이";
	}
}
