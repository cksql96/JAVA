package TempCh7;

public class SuperParent {

	protected int a = 10;
	
	public SuperParent() {
		System.out.println("나는야 부모 생성자");
		//asdf
	}
	
	public void print() {
		System.out.println("SuperParent의 print()");
		System.out.println("a = " + a + "\n");
	}
	
}
