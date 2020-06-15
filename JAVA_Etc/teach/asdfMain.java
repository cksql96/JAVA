package teach;
import java.util.*;


public class asdfMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		asdf sa = new asdf();
		sa.print();
		
		String bobo;
		System.out.println(sa.babo("바보",  "멍청이"));
		bobo = sa.babo("너는",  "해삼");
		System.out.println(bobo);
		
		
		int input = 0;
		
		do
		{
			System.out.println("1번 break, 2번 중지, 3번 return");
			input = sc.nextInt();
			System.out.println();
			if(input == 1)
			{
				break;
			}
			else if(input == 3)
			{
				return;
			}
		}while(true);
		
		System.out.println("바보");
	}
}
