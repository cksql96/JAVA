package TempCh6;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Singleton obj3 = new Singleton();				//�����ڰ� private�̶� �ȴ�
		//Singleton obj4 = new Singleton();				//�����ڰ� private�̶� �ȴ�
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü");
		}
		else
		{
			System.out.println("�ٸ� ��ü");
		}
		
		
	}

}
