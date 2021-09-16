package api.lang.stringB;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JAVA ");
		//얘는 정직하게 new를 다적어야함
		//문자열을 맨 끝에 추가하는 메서드 append()
		sb.append("Program Study");
		System.out.println(sb);
		
//		String str = "Java";	이것도 위랑 결과는 같지만 위는 공간1개 이건 공간2개다. 
//		str = str + " Program Study"; 과부하 위험이 있다.
//		System.out.println(str);
		
		//문자열 특정 인덱스 위치에 삽입하는 메서드 insert() 기존위치에 있던것을 우측으로민다.
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//repalce(): 첫인수이상 두번째인수미만까지의 내용을 세번째인자인 문자열로 변경하는 함수
		//특정 인덱스 범위의 문자열을 교체하는 메서드
		sb.replace(5, 16, "Book");
		System.out.println(sb);
		
		//문자열을 삭제하는 메서드 delete(begin, end);
		//JAVA Study
		
		sb.delete(5, 10);
		//sb.delete(4, 9);
		System.out.println(sb);
		System.out.println(sb.length());
		
		
	}
}
