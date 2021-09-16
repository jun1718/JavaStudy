package collection.list.student;

import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true) {

			Point.menuInfo();
			int menu = 0;
			try {
				System.out.print("메뉴: ");
				menu = sc.nextInt();				
			}catch(Exception e) {
				System.out.println("숫자로만 입력하세요.");
				sc.nextLine();				
			}
			System.out.println();

			switch(menu) {

			case 1:
				Point.inputPoints(students);
				break;
			case 2:
				if (students.size() == 0) {
					System.out.println("등록된 학생 정보가 없습니다.");
				}else {
					Point.showAllPoints(students);
				}
				break;
			case 3:
				Point.searchPoints(students);
				break;
			case 4:
				Point.modifyPoints(students);
				break;
			case 5:
				Point.deletePoints(students);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}

		}

	}

}



