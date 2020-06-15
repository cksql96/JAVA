package exam;

public class PythagorasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;
		int c = 0;
		
		for(a = 1; a < 20; a++) 
		{
			for(b = 1; b < 20; b++) 
			{
				for(c = 1; c < 20; c ++) 
				{
					if((a + b + c) <= 20 )
					{
						if((a*a) + (b*b) == (c*c))
						{
							System.out.println("a : " + a + ", b : " + b + ", c : " + c);
						}
					}
				}
			}
		}
		
		
		
	}

}
