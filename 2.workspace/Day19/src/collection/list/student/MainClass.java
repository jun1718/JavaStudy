package collection.list.student;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		
		
//		Student stu = null;
//		for(int i=0;i<2;i++) {
//			stu = new Student();
//			stu.inputStuInfo();
//			stu.calcTotAvgGrade();
//		}
//		
//		Point.showPointUI();
//		stu.outputStuInfo();
		
		//위에처럼하면 제대로 표현할수 없다. 배열을 사용해야한다.
		
//		Student[] stu = new Student[2];
//		for(int i=0;i<2;i++) {
//			stu[i] = new Student();
//			stu[i].inputStuInfo();
//			stu[i].calcTotAvgGrade();
//		}
//		
//		Point.showPointUI();
//
//		for(int i=0;i<2;i++) {
//			stu[i].outputStuInfo();			
//		}
		
		//바로위배열로 만든것은 100만명이왔을때 10만명이왔을때 탄력적으로 메모리할당이불가능하다.
		//이런 이유때문에(이것때문만은 아님 이외에도 편한기능이 다 부착되어있음) collector를사용
		
		List<Student> students = new ArrayList<>();
		Student stu = null;
		for(int i=0;i<2;i++) {
			stu = new Student();
			stu.inputStuInfo();
			stu.calcTotAvgGrade();
			students.add(stu);
		}
		
		Point.showPointUI();

		for(Student s : students) {
			s.outputStuInfo();			
		}
		
		
		
		
	}

}
