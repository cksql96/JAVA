package ch4;

public class FirstDayExamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.���� 10�� 20�� �հ� '����ϼ���! JAVA�� ���ô� ���
		int x = 10, y = 20;
		int sum = 0;
		System.out.println("10 + 20 = " + (x + y));
		System.out.println("�ȳ��ϼ���! JAVA�� ���ô�.");
		
		
		//2. 1~100������ ��
		System.out.println();
		
		for(int i = 1; i <=100; i++)
		{
			sum += i;
		}
		System.out.println("1���� 100������ ���� = " + sum);
		
		
		//3. 5Ģ���� + - * / %
		System.out.println();
		int a=100, b=33;
		
		System.out.println("1. ���ϱ� -> a + b = " + (a + b));
		System.out.println("2. ��   �� -> a - b = " + (a - b));
		System.out.println("3. ���ϱ� -> a * b = " + (a * b));
		System.out.println("4. ������ -> a / b = " + (a / b));
		System.out.println("5. ������ -> a % b = " + (a % b));
		
	}

}
