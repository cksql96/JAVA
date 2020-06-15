package ch4;

public class MakeTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k, ex=0;
		
		//정방향 삼각
		for(i = 1; i<=5;i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		///////////////////////////////////////////// 
		//역방향 삼각형
		for(i=1; i<=4; i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//////////////////////////////////////
		System.out.println("--------------------");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//////////////////////////////////////
		System.out.println("--------------------");
		
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

		//////////////////////////////////////
		System.out.println("--------------------");
		
		for(i = 1; i <=5; i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(ex=2;ex<=i;ex++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
