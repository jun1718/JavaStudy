package collection.list.student;

import java.util.*;

public class Point {
	public static Scanner sc = new Scanner(System.in);
	
	public static void showPointUI() {
		System.out.println("             *** 성적표 ***");
		System.out.println("=======================================");
		System.out.println("학번         이름          국어          수학    총점     평균     학점");
		System.out.println("=======================================");
	}
	
	//학생의 성적정보를 입력할 메서드
	public static void inputPoints(List<Student> students) {
		/*
	    1. 학생의 객체를 1개 생성합니다.
	    2. 학생의 객체에 속성값을 설정하는 메서드들을 호출!
	    3. 정보저장이 완료된 객체를 리스트에 추가!
	    4. 저장완료 메세지를 출력하세요.
	      ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		 */
		
		Student stu = new Student();
		stu.inputStuInfo();
		stu.calcTotAvgGrade();
		students.add(stu);
		System.out.println(stu.getName()+"님의 성적정보가 정상적으로 입력되었습니다.");
		
	}
	
	//전체 학생들의 성적정보를 출력할 메서드
	public static void showAllPoints(List<Student> students) {
		/*
	    1. 리스트 안에 들어있는 학생객체들의 정보를 
	       반복문을 통해 전체 출력하세요.
	    2. 우리반의 전체평균을 가장 아랫부분에 출력하세요.
		 */
		showPointUI();
		double classAvg = 0;
		for(int i=0;i<students.size();i++) {
			students.get(i).outputStuInfo();
			classAvg += students.get(i).getAvg();
		}
		classAvg /= students.size();
		System.out.printf("우리반 전체평균 : %.2f점", classAvg);
	}
	
	//개별 학생의 성적정보를 출력할 메서드
	public static void searchPoints(List<Student> students) {
		/*
	    1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서
	     그 학생의 정보만 출력하세요.
	    2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력
	     하세요.
	    */
		
		System.out.print("학번입력 : ");	
		String stuNum = sc.next();
		for(int i=0;i<students.size();i++) {			
			if(stuNum.equals(students.get(i).getStuId())) {
				showPointUI();
				students.get(i).outputStuInfo();
				return;
			}
		}
		System.out.println("해당하는 학번이 없음 ㅋ");
	}
	
	//개별 학생의 성적정보를 수정할 메서드
		//성적정보만 바껴야함, 이름, 학번은 그대로
	public static void modifyPoints(List<Student> students) {
		System.out.println("성적을 수정할 학생의 학번을 입력하세요.");
		System.out.print("=> ");
		String stuNum = sc.next(); 
		boolean check = false;
		
		for(int i=0;i<students.size();i++) {			
			if(stuNum.equals(students.get(i).getStuId())) {
				Student s = students.get(i);
				System.out.println(s.getName()+"님의 성적정보를 수정합니다.");
				
				System.out.print("변경할 국어점수 : ");
				s.setKor(sc.nextInt());
				
				System.out.print("변경할 영어점수 : ");
				s.setEng(sc.nextInt());
				
				System.out.print("변경할 수학점수 : ");
				s.setMath(sc.nextInt());
				
				s.calcTotAvgGrade();
				System.out.println(s.getName()+"님의 정보가 정상적으로 수정됨");
				
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println("해당하는 학번이 없음 ㅋ");			
		}
		
		System.out.println("사랑하는 가족이 되겠습니다.");//항상출력해야하는 문구라면
							//위처럼 check로 판별해서 해야하고 그게아니라면 return
		//으로 끝내고 해당학번이 없음은 그냥 평문으로 적으면된다. 
	}
	
	//개별 학생의 성적정보를 삭제할 메서드
	public static void deletePoints(List<Student> students) {
		System.out.println("성적을 수정할 학생의 학번을 입력하세요.");
		System.out.print("=> ");
		String stuNum = sc.next(); 
		boolean check = false;
		

		for(int i=0;i<students.size();i++) {			
			if(stuNum.equals(students.get(i).getStuId())) {
				String answer;
				while(true) {
					try {					
						System.out.println(students.get(i).getName()+"님의 정보를 삭제합니다.[Y/N]");
						System.out.print("> ");
						answer = sc.next();
						break;
					} catch(Exception e) {
						System.out.println("y/n | yes/no만 입력하세요.숫자입력 거절");
					}					
				}
				
				if(answer.toLowerCase().charAt(0) == 'y') {
					//students.remove(students.get(i));
					students.remove(i);
					System.out.println(students.get(i).getName()+"님의 정보가 정상적으로 삭제됨");					
					check = true;
					break;
				}
				System.out.println(students.get(i).getName()+"님의 정보삭제를 취소합니다.");
				check = true;
			}
		}
		if(!check) {
			System.out.println("해당하는 학번이 없음 ㅋ");		 	
		}
	}
	
	//프로그램 메뉴정보를 보여줄 메서드
	public static void menuInfo() {
		System.out.println("\n***성적관리 프로그램***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 전체성적 조회");
		System.out.println("3. 개별성적 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.println("*****************************");
	}
}
