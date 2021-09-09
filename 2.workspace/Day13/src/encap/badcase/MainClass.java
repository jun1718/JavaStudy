package encap.badcase;

public class MainClass {

	public static void main(String[] args) {
		MyBirth b = new MyBirth();
		
		b.year = 2018;
		b.month = 10;
		b.day = 41;
		//이런식으로 접근할수있다면 혹여 저값들이  사용자가 넣는값이라면
		//31일이 넘어가는 값을 말로만 적지말아달라고 부탁할수있지 직접제어가 불가능함
		//그래서 은닉을 사용한다.

		b.dateInfo();
	}

}
