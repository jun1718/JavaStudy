package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);		
		
		s1.a = 45;
		Singleton.getInstance().a = 4;
		//Singleton.instance.a = 5; // 불가 
		
	}

}
