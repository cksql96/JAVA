package ch4;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1~100������ Ȧ��");
		for(int i = 1; i <=100; i++)
		{
			if(i%2 !=0) {
				System.out.print(i + "\t");
			}
			if(i%10 == 0) {
				System.out.println();
			}
		}
	}

}
