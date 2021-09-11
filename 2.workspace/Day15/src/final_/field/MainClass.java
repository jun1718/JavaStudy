package final_.field;

public class MainClass {
	
	public static void main(String[] args) {

		
		Person kim = new Person("김한국");
		
//		kim.nation = "미국"; //에러
//		kim.name = "김마이클"; //에러
		kim.age = 17;
		kim.age = 27;
		System.out.println("국적: "+kim.nation);
		System.out.println("이름: "+kim.name);
		System.out.println("나이: "+kim.age);
		
		Person park = new Person("박중국");
		park.age = 30;
		System.out.println("국적: "+park.nation);
		System.out.println("이름: "+park.name);
		System.out.println("나이: "+park.age);
		
	}
}
