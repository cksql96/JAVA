package ch6;

public class ������ {

	
	//System.out.println("�ٺ�");			//��¹��� �׳� ���� �����Ƿ�, {} �ȿ� �־��ָ� �����ִ�.
											//�� Main���� ���ο� �޸𸮸� �Ҵ����ָ� ���� ������� �ʾƵ� ����� �ȴ�.
	
	//Main���� ���ο� �޸𸮸� �Ҵ����ָ� �� ������� ������ �ȴ�.
	
	������() {										//4��
		System.out.println("�۰�");
		System.out.println(y);
	}
	
	
	int y = 1;
	static int x = 10;								//1��
	
	static {										//2��
		System.out.println("�ػ�");
		System.out.println(x);	
	}
	
	
	
	{												//3��
	System.out.println("��û��");	
	}
	
	
	
	
	
	
	
}
