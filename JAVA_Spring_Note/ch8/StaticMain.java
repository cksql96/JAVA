package ch8;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar v1 = new StaticVar();
		System.out.println("v1���� ���");					//static �� ������ Ŭ�������� ��� ������ �ȴ�. �� ���� ������ �ȴ�.
		v1.staticTest();								//�׷��� ������ ���� �־��� ���� ��� �ʱ�ȭ�� �ȴ�.
														//					v1		v2			v3
		StaticVar v2 = new StaticVar();					//static int a = 1, ++ 2,	���� ++ 3,	���� ++ 4,	
		System.out.println("v2���� ���");					//int b = 1, 		++ 2, 	�ʱ�ȭ ++ 2,	�ʱ�ȭ ++ 2
		v2.staticTest();
		
		StaticVar v3 = new StaticVar();
		System.out.println("v3���� ���");
		v3.staticTest();
		
		v1.a = 50;										//���������� a�� static�� �پ ��� �̾��.
		v1.b = 500;										//������ b�� ��� ���� �־��� ������ ��� �ʱ�ȭ�� �ȴ�.
														//static�� ����	v1		v2		v3
		System.out.println("v1.a = " + v1.a);			//v1.a = 50, 	a = 50		a = 50	a = 50
		System.out.println("v1.b = " + v1.b);			//v1.b = 500, 	b = 500		b = 2	b = 2
		
		System.out.println("v2.a = " + v2.a);
		System.out.println("v2.b = " + v2.b);
		
		System.out.println("v3.a = " + v3.a);
		System.out.println("v3.b = " + v3.b);
		
		System.out.println("StaticVar.a = " + StaticVar.a);
	}

}
