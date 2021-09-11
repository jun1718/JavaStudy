package final_.field;

public class Person {
	public int age;
	public final String nation = "대한민국";
	public final String name;	//아래 생성자에 name값 초기화 안해주면 이거 에러남
		//final을 붙이면 값이한번 저장되면 변경할수 없는 변수로 만들어진다.
		//근데 이녀석은 값을 한번 저장을 안했으니 에러가 나는것
		//자동으로 null이 되긴 하지만.. 그건 final에선 값을 한번 넣은걸로 안치는 듯
	//그럼에도불구하고 이렇게 해야하는경우는 객체별로 이름을 따로 관리하고 싶은 경우 등의 상황일텐데
		//이런경우에는 한번넣겠다고 안심을 시켜주면됨 안심시키는 방법은 생성자를 이용

	/*
	 -final 변수는 한번 값이 대입되면 값을 변경할수 없는 특징이 있기때문에 선언시 직접초기화하거나
	  생성자를 통한 초기화 로직을 작성하여 데이터가 반드시 한번 저장될수 있게해야함
	  #요약
	   final 변수 사용할때 한번 값넣는 방법 2가지
	   	-선언과 동시에 초기화
	   	-선언후 생성자에서 초기화
	 */
	
//	public Person() {
//		this.name = "안녕";
//	}
	public Person(String name) {
//		this();
		this.name = name;	//위 주석이 풀리면 에러난다. 왜냐면 안녕이라고 값이 한번 들어갔기
					//때문이다.
//		this.name = "hi";	//에러
//		this.nation = "중국"; //에러
	}
	
	
}
