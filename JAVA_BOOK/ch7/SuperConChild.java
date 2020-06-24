package TempCh7;

public class SuperConChild extends SuperConParent{

	private int c = 3;
	
	public SuperConChild(int a, int b, int c) {
		//System.out.println(); 		//super�� �Ǿտ� �ȿ��� ������ ������.
		//this.a = a;					//������ ����
		//this.b = b;					//������ ����
		super(a,b); 					//���� Ŭ������ �����ڸ� ȣ���Ͽ� �ʿ��� �Ķ���͸� ����.
		this.c = c;						
		System.out.println("SuperConChild�� ������");
	}
	
	@Override
	public void print() {
		super.print();							//a�� b�� ������ִ� SuperConParent�� print()�� ȣ��
		System.out.println("c = " + c);			//c�� ���� ������ִ� SuperConChild�� print()�� ȣ��
	}
}
