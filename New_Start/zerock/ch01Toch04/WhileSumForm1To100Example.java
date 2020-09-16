package ch01Toch04;

public class WhileSumForm1To100Example {
	
	public static void main(String[] args) {
		int sum= 0;
		int i = 1;
		
		while(i <= 100) {
 			sum = sum + i;
			
  			i++;
		}	//end while
		
		System.out.println("1~"+ (i-1) + " 합 = " + sum);
		System.out.printf("1~%d의 합 = %d", (i-1), sum);
				
	}	//end main

}	//end class
