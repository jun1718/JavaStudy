
public class _8CastingExample1 {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; //자동 형변환(데이터크기의 문제가 없으니까)
		
		char c = '가';
		int j = c;	//위와 같은 케이스  자동형변환
		System.out.println("가의 유니코드 : " + j);
		
		int k = 500;
		double d = k; //int -> double 자동 형변환
		System.out.println(d);
		
		float kz = 500L; //long이 float에 들어간 것
		System.out.println(kz);
	}
}
