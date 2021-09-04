
public class _1IfExample1 {
	public static void main(String[] args) {
		//0~100까지의 정수형 난수 발생
		int point = (int)(Math.random()*101);
		System.out.println("점수: "+point);
		
		if(point>=60) {
			System.out.println("60점 이상입니다.");
			System.out.println("시험에 합격했습니다.");
		} else {
			System.out.println("60점 미만입니다.");
			System.out.println("시험에 불합격했습니다.");			
		}//end else
		System.out.println("수고하셨습니다!");
	}//end main
}//end class
