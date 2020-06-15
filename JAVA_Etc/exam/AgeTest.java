package exam;
import java.util.*;

public class AgeTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("정수를 넣어라");
		input = sc.nextInt();
		
		if(input >=19)
		{
			System.out.println("성년");
		}
		else
		{
			System.out.println("미성년");
		}
		
		
	}

}
