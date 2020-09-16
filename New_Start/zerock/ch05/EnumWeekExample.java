package ch05;

import java.util.Calendar;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		//today는 변수로 들어간다. 그래서 today는 stack으로 들어간다.
		//변수가 객체일수도 있고, 어쨋든 변수이며, 객체여서, 힙에도 들어가고, stack에도 들어간다.
		Week today = null;
		
		//달력 객체의 생성
		Calendar cal = Calendar.getInstance();
		//오늘이 무슨 요일인지 알고자 할때 쓰는 수식
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("week : " + wk);
		
		switch(wk) {
		case 1: today = Week.SUNDAY;	break;
		case 2: today = Week.MONDAY; 	break;
		case 3: today = Week.TUESDAY;	break;
		case 4: today = Week.WEDNESDAY;	break;
		case 5: today = Week.THURSDAY;	break;
		case 6: today = Week.FRIDAY;	break;
		case 7: today = Week.SATURDAY;	break;
		}	//end switch
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일은 잡니다.");
		} else {
			System.out.println("공부합니다.");
		}	//end if-else
		
	}	//end main

}	//end class
