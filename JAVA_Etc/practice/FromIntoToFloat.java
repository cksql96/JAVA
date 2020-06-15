package practice;

public class FromIntoToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 123456780;
		int num2 = 123456780;
		
		System.out.println("num1은 " + num1);
		System.out.println("num2는 " + num2);
		System.out.println();
		
		float num3 = num2;
		System.out.println("num3 = " + num3);
		num2 = (int) num3;
		
		System.out.println("강제형변환 후 num2 = " + num2);
		System.out.println();
		
		int a =  num1 - (int) num3;
		double b = (num1 - num3);
		
		int result = num1 - num2;
		System.out.println("num1 - 변환후 num2 = " + result);
		
		System.out.println("int a로 계산할때, num1 - num3 = " + a);
		System.out.println("double b 로 계산할때, num1 - num3 = " + b);
		
	}

}
