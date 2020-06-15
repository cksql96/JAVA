package ch3;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 0.7조각을 빼면, " + result + "조각이 남는다. " );
		
		
		int a = 1;
		float b = 0.1f;
		int c = 7;
		float d = a - (b*c);
		float e = b*c;
		System.out.println(d);
		System.out.println(e);
	}

}
