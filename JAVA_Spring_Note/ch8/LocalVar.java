package ch8;

public class LocalVar {
	int memVar;		//�ɹ� ���� -> Ư���� ���� �ȵǸ� 0���� �ʱ�ȭ
	
	void localTest() {
		int a = 10; 
		int c;		//���� ���� -> Ư���� ���� �ȵǸ� garbage collection�� ��
		
		{
			int b = 20;
			System.out.println("��� ��");
			System.out.println("a = " +a + ", b = " +b);
		}
		
		int b = 30;
		System.out.println("��� ��");
		System.out.println("a = " + a + ", b = " + b);
		
		System.out.println("�� �Ҵ� ���� memVar = " + memVar);
		memVar = 100;
		System.out.println("�� �Ҵ� ���� memVar = " + memVar);
	}
	
	void printVar() {
		System.out.println("memVar = " + memVar);
	}

}