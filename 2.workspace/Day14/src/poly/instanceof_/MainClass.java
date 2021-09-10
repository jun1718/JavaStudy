package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		printPersonInfo(new Person("닭강정",22));
		printPersonInfo(new Student("김말이", 24, "44"));
		printPersonInfo(new Teacher("볶음밥", 33,"요리"));
		printPersonInfo(new Employee("떡볶이",21, "주방"));

	}
	
	
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("***********학생의 정보***********");
		}
		else if(p instanceof Teacher) {
			System.out.println("***********선생님의 정보***********");
		}
		else if(p instanceof Employee) {
			System.out.println("***********회사원의 정보***********");
		}
		else {
			System.out.println("***********사람의 정보***********");
		}
		
		System.out.println(p.info());
	}
}
