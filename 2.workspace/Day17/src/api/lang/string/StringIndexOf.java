package api.lang.string;


public class StringIndexOf {
	public static void main(String[] args) {
		String sbj = "자바 프로그래밍"; //8글자
		//문자열의 문자개수(길이)를 리턴하는 length()
		
		System.out.println("sbj의 길이: "+ sbj.length());
		
		//문자열의 특정 인덱스 문자를 추출하는 charAt()
		System.out.println(sbj.charAt(6));
		
		//문자열의 특정 문자의 인덱스 번호를 리턴하는 indexOf()
		int location = sbj.indexOf("프");
		System.out.println("프의 인덱스번호 : "+location);

	}
}
