package api.lang.string;

public class StringValueOf {
	public static void main(String[] args) {
		int a = 10;
		double b = 8.79;
		System.out.println(a+b);
		
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		System.out.println(str1+str2);
		//String.valueof(정수형데이터) 반대관계
		//Integer.perseInt(문자열)
	}
}
