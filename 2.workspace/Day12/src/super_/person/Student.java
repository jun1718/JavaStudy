package super_.person;

/*
 * 다른 클래스로부터 멤버변수와 메서드를 물려받는 클래스를
 * 자식 클래스라고 부릅니다. 
 * 자식 클래스의 이름 뒤에 extends라는 키워드를 쓰고 
 * 물려받을 클래스의 이름을 써줍니다.
 */
public class Student extends Person {
	String stuID;
	
	Student(String name, int age, String str){
		super(name, age);
		this.stuID = str;
//		this.name = name;
//		this.age = age;
		
	}
	Student(){
		this("이름없음", 1, "학번없음");	//여기는 super()가 없음 어차피 this가면 거기에
					//결국 super()를 만나기때문
	}
	
	String info() {
		//return "이름: " + name + ", 나이: " + age + ", 학번: " + stuID;
		return super.info() +" 학번: " + stuID;
	}
	
}
