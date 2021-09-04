
public class _9CastingOperator {
	public static void main(String[] args) {
		char c = 'B';
		int i = 1;
		
//		char cc = c + i; //에러 c+i는 int형으로 반환되는데 그럼 char에 더큰데이터타입인
						//int를 넣어줘야하니까 강제형변환해야함
//		char cc = 'B' + 4; //근데 이거도 int로 바꼈을텐데 왜 자동형변환이될까?
				//혹시 이놈은 'B'+4를 int값이 아니라 byte값으로 받아들인걸까?
//		char cc = 'B' + (byte)i;	//이거 에러나는거 보니까 그건 아닌것같다.		
//		int d = c+i;	//에러안남 int를 int에 넣으니
		//char cc = (char)(c + i);	//이건 자료형이 둘다 명시되어있으니 byte로 못보고 위에 는
							//char + byte로 봐서 char를 byte로 변경시켰나보다.
		
//		char cc = (char)(c+i);
		byte z = (byte)i;
//		char cc = z;	//에러
		char cc = 65;	//문자또는 숫자상수는 처음엔 기본자료형 int로 되어있지만 
		//대입연산자를 만나면 lvalue가 char, int 데이터공간에 한해서 자동형변환을 한후 들어가나봄
		//하지만 +연산을 해서 int로 바뀐 놈은 
		
		//하지만 +연산을하면 당장에 상수간 연산을해야히니 기본자료형인 int로 잡나봄?
		cc = (char)(c + i);
		int ii = c+i;
		
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
//		double d = j/4;
//		double d = j/(float)4;
//		double d = j/(double)4;
		double d = j/4.0;	//j가 자동으로 double로 변경되어 계산됨
		//데이터타입의 크기가 다른 값간에 연산시에 작은쪽을 큰쪽타입으로 변경해서 계산함
		System.out.println(d);
		
		byte b1 = 100;
		byte b2 = 10;
//		byte b3 = b1 + b2; //에러 : 바이트더하기 바이트인데 에러가 나오는 경우
		byte b3 = (byte)(b1 + b2);
		
		
		
		System.out.println(b3);
	}
}
