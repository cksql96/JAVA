package ch7;

public class Parent1 {

	int d = 0;
	
	
	Parent1 () {
		System.out.println("�� Parent1 �����ھ�. ���⿡ a ������ �ຼ��");
		int a = 0;
		System.out.println("---------------------------------------------");
	}
	
	static {
		System.out.println("�� static ����̾�. ���⿡ b ������ �ຼ��");
		int b = 0;
		System.out.println("---------------------------------------------");
	}
	
	{
		System.out.println("�� �ʱ�ȭ ����̾�. ���⿡ c ������ �ຼ��");
		int c = 0;
		System.out.println("---------------------------------------------");
	}
	
	
	
}
