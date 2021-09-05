
public class _2StringMainPulate {
	public static void main(String[] args) {
		String str = "iNSERT";
		System.out.println(str);
		
		//문자열을 일괄적으로 소문자로 변환하는 메서드는 toLowerCase()
		str = str.toLowerCase(); //반대 : toUpperCase()
		System.out.println(str);
		
		str = str.toUpperCase();
		System.out.println(str);
		
		//문자열에서 특정 문자 하나만 가져오는 메서드는 charAt(문자열인덱스번호)입니다.
		char c = str.charAt(0);
		System.out.println(str.charAt(0));
		System.out.println(c);
		
	}//main
}//class
