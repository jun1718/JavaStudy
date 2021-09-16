package collection.set;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//set에 객체를 추가  add()
		set.add("닭강정");
		set.add("김밥");
		set.add("김말이");
		set.add("단무지");
		set.add("김밥");
		
		//set객체 내부 객체수 확인
		System.out.println("set에 저장된 객체 수 : "+set.size());//4개라함
							//중복데이터 김밥이 마지막에들어와서 그건 안넣은거임

		//저장시 저장순서를 보장하지않음(출력으로 확인)
		System.out.println(set);
		
		/*
		 * set의 객체데이터를 사용하려면 반복자(Iterator)를 통해 모든 객체를 대상으로
		 * 한번씩 반복해서 꺼내야함
		 */
		
		Iterator<String> iter = set.iterator();
		//set.iterator()메서드를 통해 반복할 자료들을 힙영역에 따로 만든후
		//Iterator<string>타입 객체변수 iter에 주소를 참조해둔다.
		//Iterator 반복자 interface를 통해 구현된 객체 iter는 내부에 반복할 element를
		//하나식 반환할때마다 반환한 객체를 삭제한다.
//		String s = iter.next();
//		System.out.println(s);
//		
//		s = iter.next();
//		System.out.println(s);
//		
//		s = iter.next();
//		System.out.println(s);
//		
//		s = iter.next();
//		System.out.println(s);
//		s = iter.next();	//공간이상 noSuchElementException 
//		System.out.println(s);//더이상 검색할 element가 없다. 그래서 에러남
		 
		/*
		 * 반복자 객체가 next()메서드를 통해 set 내부의 데이터를 반복소진할때 더이상 조회할 데
		 * 이터가 없으면 예외를 발생시키기 때문에 hasNext()를 통해 더이상 소모할 데이터가
		 * 있는지의 유무를 체크합니다.
		 */
		while(iter.hasNext()) { //iter.next() 메서드는 객체내부에
						//반환할 것들을 하나식빼면서 목록을 지워서 마지막까지 빼주는것인데
				//이렇게 출력을 할때는 저장된 순서대로 출력이 된다.
				//저장될때만 들쭉날쭉으로 저장됨
				//근데 iter.hasNext()메서드는  현재 iter객체 내부에 반환할게 남았는지
			//확인하는 boolean자료형이다. 남았으면 true 없으면 false
			//set은 반드시 반복자를 통해 빼야하는데 반복자는 특성상 객체내부에 반복할 element
			//가 없을때 에러가 남으로 hasNext(넥스트할것을 가지고 있느냐?)
			
			String s2 = iter.next();
			System.out.println(s2);
			if(s2.equals("닭강정")) {
				System.out.println(s2+"맛있어~~!");
				break;
			}
		}
//		s=iter.next();에러남
		
		//set의 데이터 삭제기능 remove(), clear()
		set.remove("단무지");
		System.out.println(set);
		
		//set객체 내부가 비어있는지 확인하는 기능
		if(set.isEmpty()) {
			System.out.println("set이 비어있음");
		} else {
			System.out.println("set이 비어있지 않음");
		}
	}
}
