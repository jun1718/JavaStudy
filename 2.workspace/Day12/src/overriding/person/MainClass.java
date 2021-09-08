package overriding.person;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 45;
		System.out.println(hong.info());
		
		Student lee = new Student();
		lee.stuID = "2018110033";
		lee.name = "이순신";
		lee.age = 23;
		System.out.println(lee.info());
		
		Teacher kang = new Teacher();
		kang.subject = "수학";
		kang.name = "강감찬";
		kang.age = 44;
		System.out.println(kang.info());
		
		Employee shin = new Employee();
		shin.department = "구매부";
		shin.age = 33;
		shin.name = "신사임당";
		System.out.println(shin.info());
		

	}

}




