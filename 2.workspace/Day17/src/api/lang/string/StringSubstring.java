package api.lang.string;

public class StringSubstring {
	/*부분문자*/
	//단일문자 : charAt();
	
	public static void main(String[] args) {
		String ssn = "040404-3412343";
		System.out.println(ssn);
		
		
		/*
		 * substring() 메서드에 매개값으로 인덱스를 1개 지정하면
		 * 해당 인덱스부터 끝까지의 문자를 추출함
		 */
		String last = ssn.substring(7);
		System.out.println(last);
		
		
		/*
		 * substring()메서드에 2개를 입력하면 1번째 매개변수부터 2번째매개변수 미만의 범위까지
		 * 문자를 출력해라는 거임
		 */
		String first = ssn.substring(0, 6); //0번인덱스 이상 6번인덱스 미만
		System.out.println(first);
		
	}
}
