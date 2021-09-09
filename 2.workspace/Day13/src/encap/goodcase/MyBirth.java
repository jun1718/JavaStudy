package encap.goodcase;

public class MyBirth {
	private int year;
	private int month;
	private int day;
	public MyBirth() {
		
	}
	public MyBirth(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//대부분의 데이터는 private로 한다. 우리가 의도하지 않는 데이터의 형태가 저장될까봐
	/*
	 * 은닉된 멤버변수에 접근하기 위해서는 클래스 설계자가 미리 만들어놓은 setter/getter메서드를 사용
	 * 하여 데이터에 접근해야함
	 */
	
	/*
	 * setter 메서드 선언
	 * 1. setter 메서드는 은닉변수에 값을 저장시키기 위한 메서드임
	 * 2.메서드의 접근 제한자를 public으로 설정하여 이름은 일반적으로 set+멤버변수 이름으로 지정
	 */
	
	public void setDay(int day) {
		if (day<1||day>31) {
			System.out.println("잘못된 일수 입력입니다.");
		}else {
			this.day = day;
		}		
	}
	public void setMonth(int month) {
		if (month<1||month>31) {
			System.out.println("잘못된 월수 입력입니다.");
		}else {
			this.month = month;
		}
	}
	public void setYear(int year) {
		if (year<0||year>3000) {
			System.out.println("잘못된 년수 입력입니다.");
		}else {
			this.year = year;
		}
	}
	
	
	/*
	 * getter 메서드선언
	 * 1.getter 메서드는 은닉변수의 값을 얻어낼때 사용하는 메서드입니다.
	 * 2.setter와 마찬가지로 public 제한으로 외부에 메서드를 공개하고 이름은 일반적으로
	 * get+멤버이름으로 지정합니다.
	 */
	public int getDay() {
		return this.day;
	}
	
	
	
}
