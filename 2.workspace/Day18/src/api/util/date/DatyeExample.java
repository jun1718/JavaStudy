package api.util.date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatyeExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("YYYY년 MM월 dd일 HH시 MM분 SS초");
		System.out.println(sdf.format(date));
		
		/*
		 * 예제) java 표준 api 공식문서를 보고 아래처럼 출력하시오.  
		 * 19-02-11 오전 10:50:23
		 * 오늘은 월요일입니다. 오늘은 1년중 42번째 날입니다.
		 */
		
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf1.format(date));
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년중 D번째날입니다.");
		System.out.println(sdf2.format(date));
	}
}
