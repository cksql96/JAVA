package TempCh7;

public class UpCastingParent {

	protected int x;
	protected int y;
	
	public UpCastingParent() {
		x = 10;
		y = 20;
	}
	
	public int add() {
		System.out.println("parent�� add()");
		return x+y;
	}
	
}
