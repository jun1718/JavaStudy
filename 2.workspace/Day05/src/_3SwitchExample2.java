
public class _3SwitchExample2 {
	public static void main(String[] args) {
		String[] foods = {"비빔밥", "사시미", "북경오리", "카레", "똠양꼼"};
		//index(0~4) 범위 난수 발생
		int idx = (int)(Math.random() * 5);
		System.out.println("선택된 음식 : " + foods[idx]);
		
		switch(foods[idx]) { //문자나 정수만가능 foods는 String배열타입, idx를하니 char
								//문자타입 그래서 가능
		case "비빔밥":
			System.out.println("한식입니다.");
			break;
		case "사시미":
			System.out.println("일식입니다.");
			break;
		case "북경오리":
			System.out.println("중식입니다.");
			break;
		default:
			System.out.println("기타 해외요리입니다.");
		}
	}//end main
}//end class
