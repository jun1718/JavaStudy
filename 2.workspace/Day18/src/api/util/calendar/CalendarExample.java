package api.util.calendar;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0~11까지있고 1월이 0이다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(min);
		String strWeek = null;
		
		switch(week) {
		case 1:
			strWeek = "일";
			System.out.println("일요일입니다.");
			break;
		case 2:
			strWeek = "월";
			System.out.println("월요일입니다.");
			break;
		case 3:
			strWeek = "화";
			System.out.println("화요일입니다.");
			break;
		case 4:
			strWeek = "수";
			System.out.println("수요일입니다.");
			break;
		case 5:
			strWeek = "목";
			System.out.println("목요일입니다.");
			break;
		case 6:
			strWeek = "금";
			System.out.println("금요일입니다.");
			break;
		case 7:
			strWeek = "토";
			System.out.println("토요일입니다.");
			break;
		}
		
	}
}
