package teach;
import java.util.*;


public class asdfMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		asdf sa = new asdf();
		sa.print();
		
		String bobo;
		System.out.println(sa.babo("�ٺ�",  "��û��"));
		bobo = sa.babo("�ʴ�",  "�ػ�");
		System.out.println(bobo);
		
		
		int input = 0;
		
		do
		{
			System.out.println("1�� break, 2�� ����, 3�� return");
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
		
		System.out.println("�ٺ�");
	}
}
