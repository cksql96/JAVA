package practice;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 123456780;
		int num2 = 123456780;
		
		System.out.println("num1�� " + num1);
		System.out.println("num2�� " + num2);
		System.out.println();
		
		double num3 = num2;
		System.out.println("num3 = " + num3);
		num2 = (int) num3;
		
		System.out.println("��������ȯ �� num2 = " + num2);
		System.out.println();
		
		int result = num1 - num2;
		System.out.println("num1 - ��ȯ�� num2 = " + result);
		
	
	}

}
