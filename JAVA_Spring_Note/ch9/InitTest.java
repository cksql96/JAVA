package ch9;

public class InitTest {
	int x = 5;
	static int y = 5;
	String str = "aaa";
	
	static {				//static ���� �ʱ�ȭ
		System.out.println("static �ʱ�ȭ ��� ������ \n y = " +y);
		y = 10;
		System.out.println("-----------------------------------Static");
	}
		
	{						//�Ϲ� �ʱ�ȭ
		System.out.println("�ʱ�ȭ ��� ������ \n x = " +x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
		x = 20;
		y = 20;
		str = "bbb";
		System.out.println("---------------------------------------Nothing");
	}
	
	InitTest() {			//������ �ʱ�ȭ
		System.out.println("������ ������ \n x= " + x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
		x = 30;
		y = 30;
		str = "ccc";
		System.out.println("--------------------------------------InitTest");
	}
	
	public void print() {
		System.out.println("-----------------------------------------");
		System.out.println("��� �ʱ�ȭ�� \n x = " +x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
	}
	
	public void print2() {
		System.out.println("-----------------------------------------");
		x = 20;
		System.out.println();
		System.out.println();
		System.out.println("x = " +x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
	}
	
	
}
