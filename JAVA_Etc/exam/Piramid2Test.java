package exam;

public class Piramid2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <=5 ; i++) {
			printStar(i);
			System.out.println();
		}
				
	}
	
	public static void printStar(int star)
	{
		for(int i = 0; i < star; i++) {
			System.out.print("*");
		}
	}

}
