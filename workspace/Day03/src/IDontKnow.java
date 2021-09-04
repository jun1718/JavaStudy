
public class IDontKnow {

	public static void main(String[] args) {
		char c1 = 'B' - 1;		//int->char 자동형변환됨
		System.out.println(c1);
		
		char c2 = 'B';
		char c3 = 1;
		
		System.out.println(c2-c3);
		
		char c4 = (char)(c2 - c3); //int->char 자동형변환 안되서 강제현변환해줌
		//c1에서 int 65가 반환된 후 대입연산자를 만날꺼고
		//c4에서도 int 65가 반환된 후 대입연산자를 만날꺼임
		//c1에서 대입연산자 rvalue가 되는 값은 상수형 int일거임
		//c4에서도 대입연산자 rvalue가 되는 값은 상수형 int일거임
		//같은 상수형 int가 char형 c1, c4에 들어가는데 c1에서는 자동형변환되고 c4에서는 안되는
		//이유가 무엇일까? 
		//원래 int에서 char로 자동형변환은 안되니까 상수가 예외인 경우로 파악해야할까?
		//상수만 int에서 char로 자동형변환이 가능하다라고 정의를 내린다면
		//그 내부를 봤을때 이유는 상수는 아스키코드값이 명확히 정해진 
		
		int i1 = 5;
		char c5 = c3;
		char c7 = 5;	//정수형 상수는 언제든지 문자가될수있다.
							//자동형변환의 예외적인경우로 아스키코드로인한 자동형변환으로
							//이해해야할듯
//		char c6 = i1;	//정수형 변수는  문자가 될수 없다.(강제형변환)
			//그런데 이형식이 계산방식에도 작용하나봄
		//아스키코드로인한 자동형변환이가능한 정수형 상수간의 연산을통해 반환된 정수형 상수와
		//변수간(변수&변수,변수&정수형상수)의 연산을통해 반환된 정수형 상수가 있다고 했을때
		//같은 정수형 상수이지만 그 내부에서도 분류가 나뉘나봄
		//그래서 순수귀족혈통인 정수형상수로 반환된 정수형상수는 아스키코드로 인한 자동형변환이 가능하고
		//혼혈은 서자라서 안되나봄
		System.out.println(c4);
		
		
//		c4 = c2 - c3;
	
		//추론
		//즉 자동형변환의 예외경우는 데이터타입이 큰놈을 작은놈으로 바꿔서 넣는게 가능한 경우를 뜻하고
		//예외경우 발생방법
		//대입연산자 rvalue가 정수형 상수여야한다.(변수면 안된다)
		//예외: rvalue가 연산으로인해 반환되어진 정수형상수인경우  피연산자 두항
		//모두 정수형 상수가아닌 두항중 하나라도 정수형 변수인경우 rvalue가 정수형 상수로 반환되어도
		//자동형반환의 예외경우는 일어나지 않는다.
		
		
		System.out.println(c4);
		
	}
}