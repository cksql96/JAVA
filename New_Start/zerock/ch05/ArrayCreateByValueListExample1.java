package ch05;

public class ArrayCreateByValueListExample1 {
	
	
	public static void main(String[] args) {
//		int[] scores = {83,90,87};
		int[] scores;
		
		scores = new int[] { 83, 90, 87 };
		
		// Indexing을 통한 배열의 각 원소의 참조(사용)
		System.out.println("scores[0] = " + scores[0] );
		System.out.println("scores[1] = " + scores[1] );
		System.out.println("scores[2] = " + scores[2] );
		
		int sum = 0;
		
//		for(int i = 0; i<scores.length; i++) {	//배열의 순회(traverse)
//			sum += scores[i];
//		}	//end for
		
		for(int i : scores) {		//오른쪽에 있는 값들을 한번한번씩 i로 넣어준다. 
			System.out.println(i);	//예를 들어, 처음 83을 i로 넣어서 아래를 실행하고 다시 올라와서 90을 i로 넣고 수행	
			sum += i;				//더이상 뽑아낼 값이 없을때까지 실행.
		}	//enhanced for	향상된 for문
		
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.printf("평균 : %.2f", avg);
			
	}	//end main

}	//end class
