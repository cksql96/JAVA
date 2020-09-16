package ch01Toch04;

public class ForPrintFrom1To10Example {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		for(;;) {
			System.out.print(i + "  ");
			
			if(i >=10) {
				break;
			}	//end if
			
			i++;
		}	//end for
		
	}	//end main

}	//end class