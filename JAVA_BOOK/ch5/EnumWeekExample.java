package ch5;
import java.util.Calendar;


public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int a = cal.get(Calendar.DAY_OF_WEEK);		//일요일(1) 부터 토요일(7)까지 숫자를 리턴.
		
		switch(a) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일엔 놉니다.");
		}
		else {
			System.out.println("공부");
		}
		///////////////////////////////////////////////
		System.out.println();
		Calendar b = Calendar.getInstance();
		
		int year = b.get(Calendar.YEAR);
		int month = b.get(Calendar.MONTH)+1;
		int day= b.get(Calendar.DAY_OF_MONTH);
		int week = b.get(Calendar.DAY_OF_WEEK);
		int hour = b.get(Calendar.HOUR);
		int minute = b.get(Calendar.MINUTE);
		int second = b.get(Calendar.SECOND);
		
		요일 yoil = null;
		// or 요일 yoil = 요일.월요일;
		switch(week) {
		case 1:
			yoil = 요일.일요일;
			break;
		case 2:
			yoil = 요일.월요일; break;
		case 3:
			yoil = 요일.화요일; break;
		case 4:
			yoil = 요일.수요일; break;
		case 5:
			yoil = 요일.목요일; break;
		case 6:
			yoil = 요일.금요일; break;
		case 7:
			yoil = 요일.토요일; break;
		}
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일, " + week + "번째 요일 : " + yoil);
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
		
	}

}
