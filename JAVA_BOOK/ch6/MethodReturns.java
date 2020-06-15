package ch6;

public class MethodReturns {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReturns a = new MethodReturns();
		
		int result = 0;
		result = a.adder(4,5);
		
		System.out.println("4 + 5 = " +result);
		System.out.println("3.5 * 3.5 + " + a.square(3.5));
	}
	
	
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
	public static double square(double num) {
		return num* num;
	}
}
