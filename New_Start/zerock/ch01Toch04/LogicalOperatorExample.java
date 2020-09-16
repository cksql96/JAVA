package ch01Toch04;

public class LogicalOperatorExample {
	
	
	public static void main(String[] arg) {
		int charCode = 'A';
		
		if( (charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자이군요");
		}	//end if
		
		if( (charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");
		}	//end if
		
		if( !(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 tntwk dlrnsdy");
		}	//end if
		
		//--------------------------------------------//
		
		int value = 6;
		
		if( (value%2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는 3의 배수군요");
		}	//end if
		
		if( (value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는 3의 배수군요");
		}	//end if
				
		
	}	//end main

}	//end class
