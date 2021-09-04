
public class _2IdentifierExample {

	public static void main(String[] args) {
		//자바의 식별자 이름을 대/소문자를 구분함
		int age = 20;
		int aGe = 21;

		System.out.println(age);
		System.out.println(aGe);
		
		//식별자 이름을 숫자로 시작하게 만들지 마세요
		
		int number4 = 4;
		int num4ber = 4;
		//int 4number = 4;
		int birthDay = 020111;
		
		//키워드는 식별자 이름으로 지정 불가
		int Class = 5;
		
		System.out.println(Class);
	}

}
