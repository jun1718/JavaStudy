
public class _1EnhancedForLoop {
	public static void main(String[] args) {
		 String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
//		 for(int i=0;i<weekDay.length;i++) {
//			 System.out.println(weekDay[i] + "요일");
//		 }
		 for(String day:weekDay) {
			 System.out.println(day+"요일");
		 }
		 
		 int[] scores = {98,71,85,67,100,96};
		 //향상된 for문을 사용하여 총점과 평균을 출력
		 int sum=0;
		double avg=0;
		
		for(int i:scores) {
			sum += i;
		}
		avg = (double)sum / scores.length;
		System.out.println(avg);
	}

}
