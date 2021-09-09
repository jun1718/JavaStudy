package encap.goodcase;

public class MainClass {
	public static void main(String[] args) {
		MyBirth a = new MyBirth();
		//a.day = 41;
		a.setDay(32);
		a.setYear(2002);
		a.setMonth(5);
		System.out.println(a.getDay());
	}
}
