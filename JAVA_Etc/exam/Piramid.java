package exam;

public class Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i = 1; i <=6; i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
