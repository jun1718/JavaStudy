
public class _3CalMain {
	public static void main(String[] args) {
		_2Calculator c1 = new _2Calculator();	//1번계산기 생성
		_2Calculator c2 = new _2Calculator();	//2번계산기 생성
		
		c1.add(14);
		c1.sub(7);
		c1.mul(6);
		
		c2.add(5);
		c2.sub(4);
		c2.mul(6);
		
		System.out.println("1번계산기 결과값: "+c1.result);
		System.out.println("2번계산기 결과값: "+c2.result);		
	}
}
