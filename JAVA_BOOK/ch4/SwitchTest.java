package ch4;
import java.util.*;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년?");
		grade = sc.nextInt();
		
		switch(grade) {
			case 1:
				System.out.println("1학년");
				break;
			case 2:
				System.out.println("2학년");
				break;
			case 3:
				System.out.println("3학년");
				break;
			case 4:
				System.out.println("4학년");
				break;
			default:
				System.out.println("학년 잘못 입력");
				break;
		}
			
	}
}

