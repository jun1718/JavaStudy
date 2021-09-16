package api.lang.stringB;

public class StringTest {
	
	public static void main(String[] args) {
		String str = "A";
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			str+='A';
		}
		long end = System.currentTimeMillis();
		
		System.out.println("String 객체의 속도측정: " + (end-start)*0.001);
		
		
		StringBuilder sb = new StringBuilder("A");
		
		start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			sb.insert(i+1, 'A');
		}
		end = System.currentTimeMillis();
		
		System.out.println("StringBuilder 객체의 속도측정: " + (end-start)*0.001);
	}

}
