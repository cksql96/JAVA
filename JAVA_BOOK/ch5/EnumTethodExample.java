package ch5;

public class EnumTethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//name() �޼ҵ�						���ڿ� ����
		System.out.println("name() �޼ҵ�");
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		System.out.println();
		
		//ordinal() �޼ҵ�					���° ��ü����
		System.out.println("ordinal() �޼ҵ�");
		int ordinal = today.ordinal(); 	// 0��° ���� ����. +1 �־ ��
		System.out.println(ordinal);
		System.out.println();
		
		//compareTo() �޼ҵ�					���ķ� ���° ��ġ���� ��
		System.out.println("compareTo() �޼ҵ�");
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;			//					�Ϲ������� // ��ǻ�� ������ ���
		int result1 = day1.compareTo(day2); // ��(d2) - ��(d1)   3 - 1   -> 2 - 0 = -2
		int result2 = day2.compareTo(day1); // ��(d1) - ��(d2)   1 - 3   -> 0 - 2 =  2
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		//valueOf() �޼ҵ�					���ڿ��� ������ ���ڿ��� ������ ��ü ����
		System.out.println("valueOf() �޼ҵ�");
		if(args.length == 1) // run, run configuration, arguments, program arguments -> SUNDAY ~ SATURDAY 
		{					 // ���� ������ ���� �ȴ�. 
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);	//enum Week�� �ҷ����°��̹Ƿ�, Week�� �� �͵�� ���ƾ��Ѵ�.
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) 
			{
				System.out.println("�ָ�");
			}
			else 
			{
				System.out.println("����");
			}
		}else {System.out.println("��������");}
		System.out.println();
		
		//values() �޼ҵ�						�迭�� ����� ����
		System.out.println("values() �޼ҵ�");
		Week[] days = Week.values();
		for(Week day : days) 
		{
			System.out.println(day);
		}
		
		//for(int i = 0; i < days.length; i++) {
		//	System.out.println(days[i]);
		//}
		
		
	}

}
