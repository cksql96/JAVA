package ch5;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = { 95,71,84,93,87};
		
		int sum = 0;
		for(int a : scores) {			//a 는 scores에 들어가있는 숫자들을 참조하여 들어간다.
			sum += a;					//scores안에 있는 모든 배열들이 끝나면 for문을 종료한다.
		}
		//for(int i = 0; i < scores.length; i++) {
		//	sum += scores[i];
		//}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
	}

}
