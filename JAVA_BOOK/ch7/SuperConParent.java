package TempCh7;

public class SuperConParent {

	private int a;
	private int b;
	
	public SuperConParent(int a, int b) { //������
		System.out.println("SuperConParent�� ������");
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println("a = " + a + ", b = " + b);
	}
	
}
