





import java.util.Arrays;
import java.util.Scanner;

public class _2CustomerManager {
	//프로그램 전체에서 사용할 변수들은 클래스블록 바로 아래에 선언합니다.
	//static이 붙은 블록에서는 static변수와 static 메서드만 사용할수 있음
	
//globalVariable
	static String[] nameList = new String[100];
	static char[] genderList = new char[100];
	static String[] emailList = new String[100];
	static int[] birthList = new int[100];
	
	//현재 고객데이터가 몇명 저장되었는지 알기위한 변수 count 선언
	static int count = 0;
	
	//배열의 인덱스를 조작하기 위해 인덱스를 변수화시킴
	//배열의 인덱스는 0번부터 출발함으로 초기값을 0바로 이전값인 -1로 세팅하여 초기에
	//next를 실행했을때 인덱스가 0이되어 첫번째 고객을 조회하기 위함
	static int index = -1;
	static Scanner scan = new Scanner(System.in);

//userDefinedMethod
	//고객정보를 입력받는 메서드 선언
	public static void insertData() {
		System.out.println("==============고객정보입력=============");
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("성별(M/F): ");
		char gender = scan.next().charAt(0);
		
		System.out.print("이메일: ");
		String email = scan.next();
		
		System.out.print("출생년도: ");
		int birth = scan.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthList[count] = birth;
		
		System.out.println("=====================================");
		count++;
		index++;
	}
	public static void disp() {
		for(int i=0;i<count;i++) {
			System.out.println(nameList[i]);
			System.out.println(genderList[i]);
			System.out.println(emailList[i]);
			System.out.println(birthList[i]);
		}
	}
	public static void printData(int index) {
		System.out.println("\n===========고객정보=============");
		System.out.println(nameList[index]);
		System.out.println(genderList[index]);
		System.out.println(emailList[index]);
		System.out.println(birthList[index]);
		System.out.println("\n==============================");
	}
	
	
//main
	public static void main(String[] args) {
//while
		while(true) {
			System.out.println("\n[INFO] 고객수: " + count
					+ ", 인덱스: " + index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, "
					+ "(N)ext, (C)urrent, (U)pdate, "
					+ "(D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scan.next();
			
			menu = menu.toUpperCase();
			char m = menu.charAt(0);
//switch
			switch(m) {
			case 'ㅑ':
			case 'I':
				System.out.println("\n고객정보 입력을 시작합니다.");
				insertData();
				System.out.println("고객정보가 정상적으로 입력되었습니다.");
//				System.out.println("현재 종류별 총 입력정보");
//				System.out.println(Arrays.toString(nameList));
//				System.out.println(Arrays.toString(genderList));
//				System.out.println(Arrays.toString(emailList));
//				System.out.println(Arrays.toString(birthList));
				break;
			case 'ㅔ':
			case 'P':			
				if(count==0) {
					System.out.println("데이터를 먼저 입력해주세요."
							+"\n현재 데이터가 하나도 없습니다.");
					continue;
				}
				System.out.println("\n이전 고객정보를 조회합니다.");
				if(index==0) {
					System.out.println("이전 데이터가 없습니다.(현재 첫번재) "
							+ "\n첫번째 데이터를 다시 출력합니다.");
					printData(index);
					continue;
				}
				index--;
				printData(index);
				break;
			case 'ㅜ':
			case 'N':
				if(count==0) {
					System.out.println("데이터를 먼저 입력해주세요."
							+"\n현재 데이터가 하나도 없습니다.");
					continue;
				}
				System.out.println("\n다음 고객정보를 조회합니다.");
				if(count!=0&&index==count-1) {
					System.out.println("다음 데이터가 없습니다.(현재 마지막)"
							+ "\n가장 마지막 데이터를 출력합니다.");
					printData(index);
					continue;
				} 
				index++;
				printData(index);
				
				break;
			case 'ㅊ':
			case 'C':
				System.out.println("\n현재 고객정보를 조회합니다.");
				printData(index);
				break;
			case 'ㅕ':
			case 'U':
				System.out.println("\n현재 고객정보를 수정합니다.");
				break;
			case 'ㅇ':
			case 'D':
				System.out.println("\n현재 고객정보를 삭제합니다.");
				break;
			case 'ㅂ':
			case 'Q':
				System.out.println("\n프로그램을 종료합니다.");
				scan.close();
				System.exit(0);	//프로그램을 강제종료하는 구문
				break;
			default:
				System.out.println("\n메뉴를 잘못 입력하셨습니다.");
			}//switch
		}//while
	}//main
}//class



