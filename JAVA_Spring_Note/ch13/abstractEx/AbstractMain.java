package ch13.abstractEx;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandParent4 gp = new Child4();	//GrandParent4�� ������ ���̽�. �޼ҵ�� Child4���� ������.
										//GrandParent4�� ���� Name, Age �̷��� 2��.		�̰��� �� ĳ����.
		gp.name = "grand papa";
		gp.age = 90;
		//gp.hobby = "asdf";			//gp�� ������ name�� age�ۿ� �����Ƿ�, hobby�� �ȴ�.
		gp.print();						//print()���� name age �ΰ��� �־ �� ����.
		System.out.println("@@@@@print��, test ����@@@@@");
		gp.test();						//test()���� hobby�� ������, GrandParent4���� hobby�� ����,
										//Child4���� hobby�� ���� �����༭ null���� ����.
		
		System.out.println("------------------");
		Child4 c = new Child4();		//Child4�� ������ ���̽�. �޼ҵ�� Child4���� ������
										//Child4�� GrandParent4�� ��ӹ޾����Ƿ�, Name, Age �׸��� Child4�� Hobby�̷��� 3��.
		c.name = "child momo";
		c.age = 10;
		c.hobby = "study";
		
		c.print();
		System.out.println("@@@@@print��, test ����@@@@@");
		c.test();
		
		System.out.println("------------------");
		c.parentPrint();
		
	}

}
