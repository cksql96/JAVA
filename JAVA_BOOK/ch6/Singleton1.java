package TempCh6;

public class Singleton1 {
	
	
	static Singleton1 ��ü = new Singleton1();					//static�� ������ exception in Thread�������� ��
																//���� �Ʒ� �޼ҵ忡�� ��� ����
	Singleton1() {}
	
	static Singleton1 getInstance() {							//static ������ main part���� Singleton1.getInstance
		return ��ü;												//��� ����
	}
	
}
