package ch01Toch04;

public class ForSumFrom1To100Example {
	
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i ++) {
			
			if(i % 7 == 0) {
				sum = sum + i;
			} //end if
			
		}	//end for
		
		System.out.println("1~100의 합 = " + sum);
		
	}	//end main

}	//end class

