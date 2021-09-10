package poly.person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student hont = new Student("홍길동", 15, "32");
//		Student lee = new Student("이순신", 17, "21");
//		Student park = new Student("박찬호", 13, "61");
//		
//		Teacher kim = new Teacher("김철수", 26, "영어");
//		Teacher song = new Teacher("송영희", 29, "수학");
//		
//		Employee lim = new Employee("임꺽정", 45, "행정");
//		
//		
//		System.out.println(hont.info());
//		System.out.println(lee.info());
//		System.out.println(park.info());
//		System.out.println(kim.info());
//		System.out.println(song.info());
//		System.out.println(lim.info());
		
		
//		Student[] students = {hont, lee, park};
//		Teacher[] teachers = {kim, song};
//		Employee[] employees = {lim};
//		
//		System.out.println("==========================");
//		for(int i=0;i<students.length;i++) {
//			System.out.println(students[i].info());
//					
//		}
//		
//		System.out.println(hont);
//		System.out.println(students[0]);
//		System.out.println(hont==students[0]);

		
		Person hont = new Student("홍길동", 15, "32");
		Person lee = new Student("이순신", 17, "21");
		Person park = new Student("박찬호", 13, "61");
		
		Person kim = new Teacher("김철수", 26, "영어");
		Person song = new Teacher("송영희", 29, "수학");
		
		Person lim = new Employee("임꺽정", 45, "행정");
		
		
		System.out.println(hont.info());
		System.out.println(lee.info());
		System.out.println(park.info());
		System.out.println(kim.info());
		System.out.println(song.info());
		System.out.println(lim.info());

		System.out.println("==============================");
		Person[] people = {hont, lee, park, kim, song, lim};
		
		for(int i=0;i<people.length;i++) {
			System.out.println(people[i].info());
					
		}
	}

}
