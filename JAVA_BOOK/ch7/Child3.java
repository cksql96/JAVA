package TempCh7;

public class Child3 extends Parent3 {

	private String hobby;
	
	@Override	//(������ ������̼�) ��ӹ��� �޼ҵ带 �������ϴ°��� �˷���.
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
