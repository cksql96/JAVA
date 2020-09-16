package TeamAssignment;

public class assignment01 {
	
	public static void main(String[] args) {
		/*	정수 1~100까지의 숫자중에, 소수(Prime Number)를 모두 출력하시오! */
		/*2,3,5,7,11,13~~~ */					
			
			for(int i = 2; i <=100; i++) {
				boolean isPrime = true;
				
				for(int j = 2; j <= i-1; j++) {
					if( i % j == 0) {
						isPrime = false;
						break;
					}	//if
				}	//2nd for
				
				if(isPrime) {
					System.out.print(i + " ");
				}	//if
			}	//for
		
	}	//end main

}	//end class