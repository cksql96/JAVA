package ch13.abstractEx;

public abstract class Parent4 extends GrandParent4{
	
	//�ΰ��� �߻�޼ҵ带 ��ӹ޾ұ� ������, �ΰ� ��� �����ؾ� �ϼ��� Ŭ������ ������, 
	//print�Ѱ��� ���������Ƿ�, parent�� �߻�Ŭ�����̸� ��ü�� ������ ����.
	
	@Override
	public void print() {
		System.out.println("parent");
		System.out.println("name = " + name);
	}

}
