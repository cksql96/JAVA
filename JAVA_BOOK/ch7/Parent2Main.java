package TempCh7;

public class Parent2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandParent gp = new GrandParent();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		gp.name = "���θ�";
		gp.age = 80;
		gp.printGrandParentInfo();
		System.out.println("------------------ GrandParent ��");
		
		Parent2 p = new Parent2();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		p.name = "�θ�";
		p.age = 50;
		p.job = "ȸ���";
		p.printGrandParentInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		p.printParentInfo();
		System.out.println("------------------ Parent2 ��");
		
		Child2 c = new Child2();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		c.name = "�ڽ�";
		c.age = 20;
		c.job = "�л�";
		c.hobby = "�巳";
		c.printGrandParentInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		c.printParentInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		c.printChild2Info();
		
	}

}
