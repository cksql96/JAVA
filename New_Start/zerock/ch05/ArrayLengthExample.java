package ch05;

public class ArrayLengthExample {
	
	
	public static void main(String[] args) {
		int [] scores = {83,90,87};
		int sum = 0;
		
//		for(int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}	//end for
		
		for(int i : scores) {
			sum += i;
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		
//		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f", avg);
				
	}	//end main

}	//end class
