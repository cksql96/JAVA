package ch5;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = { 95,71,84,93,87};
		
		int sum = 0;
		for(int a : scores) {			//a �� scores�� ���ִ� ���ڵ��� �����Ͽ� ����.
			sum += a;					//scores�ȿ� �ִ� ��� �迭���� ������ for���� �����Ѵ�.
		}
		//for(int i = 0; i < scores.length; i++) {
		//	sum += scores[i];
		//}
		
		System.out.println("���� ���� = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);
		
	}

}
