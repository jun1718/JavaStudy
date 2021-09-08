package super_.person;

public class MainClass {

	public static void main(String[] args) {
		Student hong = new Student("홍길동", 13, "34");
		System.out.println(hong.info());
		
		Teacher lim = new Teacher("임창정", 50, "음악");

		System.out.println(lim.info());
	}

}
