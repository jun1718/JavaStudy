
import java.util.Scanner;

public class CustomerManager {
//variable
	static String[] nameList = new String[100];
	static char[] genderList = new char[100];
	static String[] emailList = new String[100];
	static int[] birthList = new int[100];
	
	static int count = 0;
	static int index = -1;
	
	static Scanner scan = new Scanner(System.in);
	
//userDefinedMethod
	public static void insertData() {
		System.out.print("이름입력 : ");
		nameList[count] = scan.next();
		
		System.out.print("성별입력(M/W) : ");
		genderList[count] = scan.next().toUpperCase().charAt(0);

		System.out.print("이메일입력 : ");
		emailList[count] = scan.next();
		
		System.out.print("출생년도입력 : ");
		birthList[count] = scan.nextInt();
		
		count++;
	}
	public static void updateData() {
		System.out.printf("이름입력(%s) : ", nameList[index]);
		nameList[index] = scan.next();
		
		System.out.printf("성별입력(%c) : ", genderList[index]);
		genderList[index] = scan.next().toUpperCase().charAt(0);

		System.out.printf("이메일입력(%s) : ", emailList[index]);
		emailList[index] = scan.next();
		
		System.out.printf("출생년도입력(%d) : ", birthList[index]);
		birthList[index] = scan.nextInt();
	}
	public static void printData() {
		System.out.println("=============고객정보 조회=============");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("e메일 : " + emailList[index]);
		System.out.println("출생년도 : " + birthList[index]);
		System.out.println("==================================");
	}
	public static void deleteData() {
		for(int i=index;i<count-1;i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthList[i] = birthList[i+1];
		}
		count--;
	}
	public static char menu() {
		System.out.println("\n<명령어 목록>");
		System.out.printf("현재 count: %d, 현재 index: %d\n", count,index);
		System.out.println("Insert, Previous, Current"
				+ ", Next, Update, Delete, Quit");
		
		System.out.print("명령어 입력: ");
		char menu = scan.next().toUpperCase().charAt(0);
		
		return menu;
	}
	public static void menuProcessor(char menu) {
		switch(menu) {
		case 'ㅑ':
		case 'I':
			System.out.println("\n고객의 정보 추가을 실시합니다.");
			insertData();
			break;
			
		case 'ㅔ':
		case 'P':
			System.out.println("\n이전 정보를 조회합니다.");
			if(count==0) {
				System.out.println("데이터를 입력하세요.");
				break;
			}
			if(index<=0) {
				System.out.println("인덱스값을 변경하세요.");
				break;
			}
			index--;
			printData();
			break;
			
		case 'ㅊ':
		case 'C':
			System.out.println("\n현재 정보를 조회합니다.");
			if(count==0) {
				System.out.println("데이터를 입력하세요.");
				break;
			}
			if(index<0) {
				System.out.println("인덱스값을 변경하세요.");
				break;
			}
			printData();
			break;
			
		case 'ㅜ':
		case 'N':
			System.out.println("\n다음 정보를 조회합니다.");
			if(count==0) {
				System.out.println("데이터를 입력하세요.");
				break;
			}
			if(index==count-1) {
				System.out.println("인덱스값을 변경하세요.");
				break;
			}
			index++;
			printData();
			break;
			
		case 'ㅕ':
		case 'U':
			if(count==0) {
				System.out.println("데이터를 입력하세요.");
				break;
			}
			if(index<0) {
				System.out.println("인덱스를 변경하세요.");
				break;
			}
			System.out.println("\n"+nameList[index]+"님의 정보를 수정합니다.");
			updateData();
			break;
			
		case 'ㅇ':
		case 'D':
			if(count==0) {
				System.out.println("데이터를 입력하세요.");
				break;
			}
			if(index<0) {
				System.out.println("인덱스를 변경하세요.");
				break;
			}
			System.out.println("\n정보 삭제를실시합니다.");
			deleteData();
			break;
			
		case 'ㅂ':
		case 'Q':
			System.out.println("\n고객관리 매니저를 종료합니다.");
			System.exit(0);
			break;
			
		default:
			System.out.println("명령어를 잘못 입력하셨습니다.");
		}//switch
	}//menuProcessor

//main
	public static void main(String[] args) {
		while(true) {
			char menu = menu();
			menuProcessor(menu);
		}
	}//main
}//class
