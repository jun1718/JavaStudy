package api.lang.wrapper;

import java.util.Arrays;

public class AutoBoxing {
	
	
	public static void main(String[] args) {
		//AutoBoxing: 기본 타입 데이터를 자동으로 객체로 변환
		//자바10부터는 오토박싱기능만을 사용하도록 권고하고 있음
		int a = 100;
		Integer val1 = a;
		Double val2 = 3.1415;
		
		Object[] arr = {56,3.154, "안녕", 99,200.12};
		System.out.println(Arrays.toString(arr));
		
		
		int x = val1;
		double y = val2+5.3; // +연산자를만나면 val2를 언박싱한다음에 5.3과더함 
				//이건 다형성이아니라 그냥 연산자기능임
		//parsing: 문자열 데이터를 기본타입으로 변환
		String s1 = "10";
		String s2 = "5.43";
		
		int i = Integer.parseInt(s1);
		//과정이 우측의 s1을 먼저 integer에 있는 메소드 parseInt가 연산을통해 int로바꾼후
		//int값을 반환한다. 그리고 i가 받는다. 아마 객체를 생성한게아니니까 멤버변수에저장은
		//못할거임 
		double j = Double.parseDouble(s2);
		boolean k = Boolean.parseBoolean("true");
		
		System.out.println(i*j);
		
	}

}
