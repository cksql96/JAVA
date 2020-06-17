package TempCh6;

public class PracticeOfReturn {

	public static int num(int i) {
		if(i == 1) {
			return 4;
		}
		else if(i == 2) {
			return 5;
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		int a = (int)(Math.random()*3)+1;
		System.out.println(a);
		System.out.println(num(a));
	}
	
}
