package TempCh6;

public class Singleton {

	private static Singleton ��ü = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return ��ü;
	}
	
	
	
}
