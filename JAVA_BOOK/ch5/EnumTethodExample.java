package ch5;

public class EnumTethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//name() 메소드						문자열 리턴
		System.out.println("name() 메소드");
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		System.out.println();
		
		//ordinal() 메소드					몇번째 객체인지
		System.out.println("ordinal() 메소드");
		int ordinal = today.ordinal(); 	// 0번째 부터 시작. +1 넣어도 댐
		System.out.println(ordinal);
		System.out.println();
		
		//compareTo() 메소드					전후로 몇번째 위치한지 비교
		System.out.println("compareTo() 메소드");
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;			//					일반적생각 // 컴퓨터 내에서 계산
		int result1 = day1.compareTo(day2); // 수(d2) - 월(d1)   3 - 1   -> 2 - 0 = -2
		int result2 = day2.compareTo(day1); // 월(d1) - 수(d2)   1 - 3   -> 0 - 2 =  2
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		//valueOf() 메소드					문자열과 동일한 문자열을 가지는 객체 리턴
		System.out.println("valueOf() 메소드");
		if(args.length == 1) // run, run configuration, arguments, program arguments -> SUNDAY ~ SATURDAY 
		{					 // 까지 넣으면 실행 된다. 
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);	//enum Week를 불러오는것이므로, Week에 들어간 것들과 같아야한다.
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) 
			{
				System.out.println("주말");
			}
			else 
			{
				System.out.println("평일");
			}
		}else {System.out.println("ㅁㄴㅇㄹ");}
		System.out.println();
		
		//values() 메소드						배열로 만들어 리턴
		System.out.println("values() 메소드");
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
