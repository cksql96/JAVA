package TempCh7;

public class Parent3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent3 p = new Parent3();
		p.name = "parent";
		p.printInfo();
		System.out.println("--------------------");
		Child3 c = new Child3();
		c.name = "child";
		c.setHobby("Swimming");
		c.printInfo();
		
	}

}
