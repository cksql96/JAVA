package ch7;

public class Parent {

	public String name;				//�ۺ����� ���� �������� ��� ����
	protected int age;				//�ڱ� ���Ȼ���鸸 ���. ��ӹ޾����ÿ���(extends)
	private int money;				//�ڱ� ȥ�ڸ� ��밡��
	int momo = 0;
	
	public Parent() {
		System.out.println("Parent ������");
		int babo = 0;
	}
	
	
	public void printParentInfo() {
		System.out.println("name : " +name);
		System.out.println("age : " + age);
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
