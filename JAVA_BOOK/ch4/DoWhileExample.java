package ch4;
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�޼����� �Է��ϼ���. \n���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			System.out.println();
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		
		
	}

}
