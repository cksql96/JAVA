package ch3;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charCode = 'A';
		if ((charCode >=65) & (charCode<=90)) {
			System.out.println("�빮��");
		}
		
		if ((charCode >=97) && (charCode<=122)) {
			System.out.println("�ҹ���");
		}
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9����");
		}
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2�� 3�� ���");
		}
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2�� 3�� ���");
		}
		
		// & �� &&�� ���̴� &�� �ΰ��� ���� �� Ȯ���ϴ� �ݸ鿡 &&�� �տ����� false�� ��� �ڿ����� �����ʰ� false�� �����Ͽ�
		// �� ȿ�����̴�.
		// | �� ||�� ���̵� &�� ����. |�� �Ѵ� Ȯ���ϰ� ||�� �տ����� ture�ϰ�� �ڿ����� �����ʰ� true�� �����Ѵ�.
			
	}

}
