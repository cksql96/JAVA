package TempCh7;

public class UpCastingChild extends UpCastingParent{

	private int z;
	
	public UpCastingChild() {
		x = 100;
		y = 200;
		z = 300;
	}
	
	@Override
	public int add() {
		System.out.println("child�� add()");
		return x + y + z;
	}
	
	public int sub() {
		System.out.println("child�� sub");
		return x - y - z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z=z;
	}
}
