package collection.list;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList 객체 생성
//		ArrayList list = new ArrayList();
		//List list = new ArrayList();
		//ArrayList의 부모가 list이기때문에 list라고 많이씀
		
		//제네릭(generic): 타입의 안정화를 위해 객체 내부에 저장되는
		//타입을 일치시키는 방법
		//그냥 list라고만하면 모든 자료형을 다 오면 오히려 관리가 힘들어서 이랬단다
		
		List<String> list = new ArrayList<String>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		
		
		
		
		System.out.println(list);
		
		//list에 객체를 저장하는 메서드 add(): 데이터를 맨 끝에 추가
		list.add(str1);
		list.add(str2);
		list.add("DataBase");
		list.add("JDBC");
		list.add("JSP"); //리스트는 객체의 중복저장을 허용
		
		System.out.println(list);
		
		//list에 저장된 총 객체수 얻기size()
		
		int size = list.size();
		System.out.println("list에 저장된 총 객체 수: "+size);
		
		//list에 객체 삽입 add(index, 객체) : 데이터를 해당 인덱스에 삽입
		list.add(2, "Oracle");
		
		System.out.println(list);
		
		//list 객체 수정
//		list[3] = "MySQL"; list는 객체들을 모으는 객체일뿐이지 그렇다고 배열은아니다.
		//배열처럼 순차적으로 모이긴하는데 괄호에 인덱스로 접근하는건 컬렉션의 arrayList에는
		//존재하지 않는 연산자기능이다.
		
		//이방법을 씀 : list 데이터수정 set(index, 객체)
		
		list.set(3,  "MySQL");
		
		System.out.println(list);
		
		//list 내부 객체 가져오기 get(index)
//		System.out.println(list[3]); 이것도 마찬가지. 배열과는다름 괄호는 컬렉션에없다.
		String s = list.get(2);
		System.out.println("2번인덱스 객체: "+s);
		
		//list에 저장된 객체의 인덱스번호 확인하기 indexOf(객체)
		int idx = list.indexOf("MySQL");
		System.out.println("MySQL이 저장된 인덱스: "+idx);
		
		//indexOf는 객체를 검색하지 못했을 경우 -1을 리턴함
		idx = list.indexOf("안녕~~~");
		System.out.println("MySQL이 저장된 인덱스: "+idx);

		//list에서 객체데이터 삭제 remove(index), remove(obj)
				//삭제시 자동으로 공간도 없어짐
		list.remove(5); //특정인덱스의 공간을 삭제
		
		System.out.println(list);
		
		list.remove(str1);	//특정 객체를 삭제
		System.out.println(list);
		
		//list 내부에 저장된 객체의 유무확인 contains() boolean 반환
		System.out.println(list.contains("JSP"));
		System.out.println(list.contains(str1));
		System.out.println(list.contains(str2));
		System.out.println(list.contains("바붕이"));
		
		//list의 반복문 처리
		System.out.println("--------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("--------------------");
		
		//list내부 데이터가 전부 비었는지 확인하는 메서드 isEmpty() is면보통 의무문으로
				//해석하는방식. 비어있니? 이러니까 값이 보통 불리언으로 반환됨
		//비었으면 true 비지 않았으면 false
		
		if(list.isEmpty()) {
			System.out.println("list가 비어있음");
		} else {
			System.out.println("list가 비어있지 않음");
		}
		
		//list 내부 객체 전체 삭제 clear()
		
		list.clear();
		System.out.println(list);
		
		String s1 = "hi";
		String s2 = "hi";
		
		System.out.println(s1==s2);
		s2 += "bye";
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
