package TempCh7;

public class SuperChild extends SuperParent{

	private int a = 20;			//��ӹ��� �ʵ带 �� �����ϸ� ����Ŭ�������� ����Ŭ������ �ʵ�� ��������.
								//SuperParent�� a�� ��������.
	
	public SuperChild() {
		super();
		System.out.println("���¾� �ڽ� ������");
	}
	
	@Override
	public void print() {
		System.out.println("SuperChild�� print()");
		System.out.println("a = " + a + "\n");
		SuperCall();				//�̰Ÿ� ���� �޼ҵ�� �Ƚᵵ �ҷ����� �Ѵ�. ���۸� ����.
		System.out.println();
		System.out.println("super.a�� �ҷ����� - " + super.a);
		System.out.println("a�� �ҷ����� - " +a);	
	}
	
	//���� Ŭ������ �ʵ�� �޼��忡 �����ϴ� �޼���
	public void SuperCall() {
		System.out.println("super.a = " + super.a);
		super.print();
	}
	
	
	
}
