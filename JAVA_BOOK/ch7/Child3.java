package TempCh7;

public class Child3 extends Parent3 {

	private String hobby;
	
	@Override	//(재정의 어노테이션) 상속받은 메소드를 재정의하는것을 알려줌.
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
