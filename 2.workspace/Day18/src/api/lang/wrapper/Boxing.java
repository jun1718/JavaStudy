package api.lang.wrapper;

import java.util.Arrays;

public class Boxing {
	public static void main(String[] args) {
		int a = 100;
		double b = 3.51;
		char c = 'H';
		boolean d = false;
		
		//Boxing: 기본타입의 데이터를 객체타입으로 변환
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		Byte val5 = new Byte((byte)75);
		String val6 = new String("hello");
		
		Object[] arr = {val1,val2,val3,val4,val5,val6};
		//object에 int,double,char,boolean을 다 정의해 놓았단 말인가?
		//그렇지않으면 val1은 object의 메서드와 변수는 쓸수있어도 본인의 변수는쓰지못한다.
		//이론상 object에 기본형타입으로 변수를 만들어놓았고 그녀석을 super를이용해서 자식객체
		//를 만들때 들어온 인자값을 부모클래스에게 보내서 부모클래스의 변수가 찼다고 보는게 맞는듯
		//그래서 객체 하나당 하나의 값밖에 가질수 없고 String은 내부에서 char를 많이 받을수있게
		//char형 배열을 만들어놓은것으로 추측됨
		
		System.out.println(Arrays.toString(arr));
		
		//unboxing: 포장된 데이터를 다시 기본타입으로 변환
		//포장클래스가 제공하는 기본타입이름+value()메서드를 이용
		int i = val1.intValue();
		double j = val2.intValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
		
		
		
	}
}
