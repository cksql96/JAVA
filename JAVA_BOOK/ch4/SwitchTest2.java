package ch4;
import java.util.Scanner;
public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "";
		Scanner sc= new Scanner(System.in);
		System.out.println("�г� �Է�");
		grade = sc.next();
		switch(grade) {
		case "1�г�" :
			System.out.println("1�г���");
			break;
		case "2�г�" :
			System.out.println("2�г���");
			break;
		case "3�г�" :
			System.out.println("3�г���");
			break;
		case "4�г�" :
			System.out.println("4�г���");
			break;
		default :
			System.out.println("�г� �߸� �Է�");
			break;
		}
	}

}
