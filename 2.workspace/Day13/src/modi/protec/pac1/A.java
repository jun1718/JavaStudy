package modi.protec.pac1;

public class A {
	/*
	 * protected는 다른패키지라할지라도 양클래스간의 관계가 상속관계라면 제한적으로 접근 허용해주는 
	 * 접근제한자임
	 */
	
	protected String s;//멤버변수
	
	protected A() {}	//생성자
	//public A() {}	//생성자
	
	protected void method() {} //메서드
}
