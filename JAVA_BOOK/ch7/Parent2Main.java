package TempCh7;

public class Parent2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandParent gp = new GrandParent();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		gp.name = "조부모";
		gp.age = 80;
		gp.printGrandParentInfo();
		System.out.println("------------------ GrandParent 끝");
		
		Parent2 p = new Parent2();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		p.name = "부모";
		p.age = 50;
		p.job = "회사원";
		p.printGrandParentInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		p.printParentInfo();
		System.out.println("------------------ Parent2 끝");
		
		Child2 c = new Child2();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		c.name = "자식";
		c.age = 20;
		c.job = "학생";
		c.hobby = "드럼";
		c.printGrandParentInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		c.printParentInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		c.printChild2Info();
		
	}

}
