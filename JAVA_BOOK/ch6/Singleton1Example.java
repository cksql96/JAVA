package TempCh6;

public class Singleton1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton1 obj1 = Singleton1.getInstance();		
		Singleton1 obj2 = Singleton1.getInstance();		
		
		Singleton1 obj3 = new Singleton1();				
		Singleton1 obj4 = new Singleton1();				
		
		System.out.println("getInstance �޼ҵ� ����");
		if(obj1 == obj2) {
			System.out.println("���� ��ü");
		}
		else
		{
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println();
		System.out.println("�޸� �Ҵ�������");
		if(obj3 == obj4) {
			System.out.println("���� ��ü");
		}
		else
		{
			System.out.println("�ٸ� ��ü");
		}
		
	}

}
