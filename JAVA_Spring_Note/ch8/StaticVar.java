package ch8;

public class StaticVar {

	static int a=1;		//�ʱ�ȭ�� �ѹ��� �����Ѵ�.
	int b=1;			//�Ϲ� �ɹ� ���� b�� 1�� �ʱ�ȭ
	
	void staticTest() {
		a++;
		b++;
		System.out.println("static var a = " + a);
		System.out.println("non static var b = " +b);
	}
	
}
