package exam;

public class Second_Test_Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Q1. �����ܸ����");
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 2; j < 10; j++)
			{
				if(i == 0) 
				{
					System.out.print(j + "�� \t");
				}
				else 
				{
					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Q2. �迭 ���� �� �ʱ�ȭ");
		
		int[] arr;							//�迭 ����
		arr = new int[3];					//�迭 ����
		int[] arr1 = {1,2,3};				//�迭 �ʱ�ȭ
		int[] arr2 = new int[] {1,2,3}; 	//�迭 ���� �� ���� �� �ʱ�ȭ
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q3. int �� �ΰ� ���� �� �� ���ϱ�");
		
		int a = 10, b = 5;
		System.out.println("a �� b�� ���� = " + (a+b));
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q4. 1~100�� �ձ��ϱ�");
		
		int sum = 0;
		for(int i = 1; i < 101; i++)
		{
			sum += i;
		}
		System.out.println("1~100�� ���� = " + sum);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q5. �������� 1~20 ���� x�� y�� �ְ�, ���� ū �� ���ϱ�(��ȭ ����)");
		
		int x = (int)(Math.random()*20)+1, y = (int)(Math.random()*20)+1;
		int max = 0;
		
		System.out.println("x = " + x + ", y = " + y);
		if(x>y) 
		{
			max = x;
			System.out.println("�׷��Ƿ� " + max + "�� x �� �� ũ��!");
		}
		else if(x == y) 
		{
			System.out.println("���� ���� �����ϴ�. �ٽ� ��������!");
		}
		else 
		{
			max = y;
			System.out.println("�׷��Ƿ� " + max + "�� y�� �� ũ��!");
		}	
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q5. ���� ū�� ���ϱ�(���� ����)");
		
		int c = 1, d = 2;
		System.out.println("c = " + c + ", d = " + d);
		if(c > d)
		{
			max = c;
			System.out.println("c�� �� ŭ. c = " + max);
		}
		else if(c == d)
		{
			System.out.println("���� ���� ����");
		}
		else
		{
			max = d;
			System.out.println("d�� �� ŭ. d = " + max);
		}
		
		
	}

}
