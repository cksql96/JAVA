package ch4;
import java.util.*;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�г�?");
		grade = sc.nextInt();
		
		switch(grade) {
			case 1:
				System.out.println("1�г�");
				break;
			case 2:
				System.out.println("2�г�");
				break;
			case 3:
				System.out.println("3�г�");
				break;
			case 4:
				System.out.println("4�г�");
				break;
			default:
				System.out.println("�г� �߸� �Է�");
				break;
		}
			
	}
}

