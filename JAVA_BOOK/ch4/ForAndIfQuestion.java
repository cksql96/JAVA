package ch4;

public class ForAndIfQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2, b=3, c=5;      //c 10 = 50 //b 9 = 27 //a 2 = 4
		int sum = 0;
		System.out.println("2g, 3g, 5g 추가 10개 씩 있다. 이를 조합하여 81g을 만들어라. \n");

		BABO : for(int i/*2*/ = 0; i <=10; i++) 
		{
			for(int j/*3*/ = 0; j <= 10; j++) 
			{
				for(int k/*5*/=0; k<=10; k++) 
				{
					sum = (i*a) + (j*b) + (k*c);
					if(sum == 81) {
						System.out.println("2g은 " + i + "개 \n3g은 " + j + "개 \n5g은 " + k + "개");
						System.out.println(sum+"g");
						System.out.println("정답입니다");
						System.out.println();
						//break BABO;
					}
				}
			}
		}
		
		
		
	}

}
