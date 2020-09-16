package ch05;

public class EnumMethodExample {
	
	
	public static void main(String... args ) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		
		System.out.println(name);
		
		//-----------------------------------//
		
		int ordinal = today.ordinal();
		
		System.out.println(ordinal);
		
		//-----------------------------------//
		
		Week day1 = Week.MONDAY;	//0
		Week day2 = Week.WEDNESDAY;	//2
		
		int result1 = day1.compareTo(day2);		//day1=0, day2=2, 0-2 = -2
		int result2 = day2.compareTo(day1);		//day2=2, day1=0, 2-0 =  2
		
		System.out.println(result1);
		System.out.println(result2);
		
		//-----------------------------------//
		//value of -> 타입을 바꿔주겠다.
		//Week.valueOf("SUNDAY"); -> Week타입에 있는 열거상수들중 맞는게 있으면, 그것을 넣어준다.
		//만약 열거상수중 없다면 오류뜸.
		
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말입니다.");
		} else {
			System.out.println("평일입니다.");
		}	//end if-else
		
		//-----------------------------------//
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay1 = Week.valueOf(strDay);
			
			if(weekDay1 == Week.SATURDAY || weekDay1 == Week.SUNDAY) {
				System.out.println("주말입니다.");				
			} else {
				System.out.println("평일입니다");
			}	//end if-else
			
		} //end if
		
		//-----------------------------------//
		Week[] days = Week.values();
		//Week는 타입이라고 보면 되고, 타입[]는 배열이다.
		for(Week d : days) {	//Week day는 int i 라고 보면 된다.
			System.out.println(d);
		}	//end enhanced for
		
		
	}	//end main

}	//end class
