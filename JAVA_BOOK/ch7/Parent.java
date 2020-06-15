package ch7;

public class Parent {

	public String name;				//퍼블릭으로 인해 모든곳에서 사용 가능
	protected int age;				//자기 집안사람들만 사용. 상속받았을시에만(extends)
	private int money;				//자기 혼자만 사용가능
	int momo = 0;
	
	public Parent() {
		System.out.println("Parent 생성자");
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
