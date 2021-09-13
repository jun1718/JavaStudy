package exception.throws_;

public class ThrowsExample2 {
	public void aaa(int n) throws Exception{
		System.out.println("aaa 호출!");
		int i = 10 / n;
		System.out.println("계산결과: "+i);
		System.out.println("aaa 실행종료!");
	}
	

	public void bbb() throws Exception{
		System.out.println("bbb 호출!");
		aaa(0);
		System.out.println("bbb 실행 종료!");
	}
	
	public void ccc() throws Exception{
		System.out.println("cccc 호출!");
		bbb();
		System.out.println("cccc 실행종료!");
	}
	
	public ThrowsExample2() throws Exception{
		System.out.println("생성자 호출!!");
		ccc();
		System.out.println("생성자 종료!!");
	}
	
	public static void main(String[] args) {
		try {			
			ThrowsExample2 te = new ThrowsExample2();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hihi");
	}
}
