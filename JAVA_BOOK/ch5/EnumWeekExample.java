package ch5;
import java.util.Calendar;


public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int a = cal.get(Calendar.DAY_OF_WEEK);		//�Ͽ���(1) ���� �����(7)���� ���ڸ� ����.
		
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
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ� ��ϴ�.");
		}
		else {
			System.out.println("����");
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
		
		���� yoil = null;
		// or ���� yoil = ����.������;
		switch(week) {
		case 1:
			yoil = ����.�Ͽ���;
			break;
		case 2:
			yoil = ����.������; break;
		case 3:
			yoil = ����.ȭ����; break;
		case 4:
			yoil = ����.������; break;
		case 5:
			yoil = ����.�����; break;
		case 6:
			yoil = ����.�ݿ���; break;
		case 7:
			yoil = ����.�����; break;
		}
		
		
		System.out.println(year + "�� " + month + "�� " + day + "��, " + week + "��° ���� : " + yoil);
		System.out.println(hour + "�� " + minute + "�� " + second + "�� ");
		
	}

}
