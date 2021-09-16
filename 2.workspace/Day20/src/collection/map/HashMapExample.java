package collection.map;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//저장될 객체의 키는 String객체를 이용해서 저장, 저장될 객체들은(value는) 
		//Integer형태의 객체들만 저장
		
		//map에 객체를 저장 put(key, value)
		map.put("치킨", 20000); 
		map.put("라면", 2000);
		map.put("족발", 30000);
		//put메서드로 중복키를통해 값을 저장하면 해당 키의 값이 수정됨(중복키가 저장되는건 아님)
		map.put("라면", 3000);
		
		System.out.println(map);
		
		//map에 저장된 총 Entry 객체 수 얻기 size()  
			//-entry: 키와 벨류를 통해 저장된 객체를 entry라 함
			//list와 set계열의 컬렉션객체에서 내부 객체는 elements라고 함
		
		System.out.println("map에 저장된 총 객체수: "+map.size());
		
		//키값을 이용하여 
			//map객체 내부에 저장된 entry(키+value형태로 저장된 객체)의 벨류를 반환
			//get(key)
//		Integer priceJok = map.get("족발");
		int priceJok = map.get("족발");
		//Integer형 데이터가 반환되지만 받는곳이 int라고 해도 자동으로 언박싱해서 저장한다.
		
		System.out.println("족발의 가격: "+priceJok);
		
		//map을 통해 key를 전부 추출한 공간을 만든후 
		//Set타입 객체변수에게만  추출한 데이터가 있는 공간을 참조해주는 메서드 keySet();
		Set<String> kSet = map.keySet();
//		List<String> kSet = map.keySet(); //에러남
		System.out.println(kSet);
		Iterator<String> kIter = kSet.iterator();
		
		//그 set으로 추출받은 키값을 하나하나값을 받아서 포문으로 출력하기(Set계열복습)
		//set으로 추출받은 키값과 map, while을 이용하여 음식의 가격은 얼마원입니다.라고 반복출력
			//반환받을 변수: foodName, foodPrice
			//Map계열인 hashMap객체는 get(key)를 통해 벨류값만 반환가능하지만,
		//key값을 반환할순없다. 그래서 key값을 keySet() set에 따로 추출한뒤 
		//그 키값을 이용하여 벨류를 꺼낸다.
		while(kIter.hasNext()) {
			String foodName = kIter.next();
			int foodPrice = map.get(foodName);
			System.out.printf("%s의 가격은 %d원입니다.\n", foodName, foodPrice);
		}
		
		System.out.println(map.get("족발"));
		System.out.println(map.get("ㅁㅇ러ㅑㅐㄷㅂ")); // 해당키가없으면 null값
													//반환
		
		//map내부에 있는 key의 유무를 확인하는 메서드 containsKey
			//food라는 변수를 만들고 거기에 문자열값을 넣어서 if문에
		//map객체에 food값인 키값이 있는지 확인 하여 있으면 해당 키값의 벨류를 출력하고
		//없으면 해당 키가 없다고 해라(피자는 없는 메뉴입니다.)
		String food = "피자";
		
		if(map.containsKey(food)) {
			System.out.println(food+"의 가격은 "+map.get(food));
		} else {
			System.out.println(food + "는 없는 메뉴입니다.");
		}
		
		//map내부 데이터 삭제 remove(key)
		map.remove("치킨");
		System.out.println(map);

		//map내부 데이터삭제 전부
		map.clear();
		System.out.println(map);
		
	}
}
