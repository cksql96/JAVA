package exam;
import java.util.*;
public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("��� �Է�");
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("���� ����"); break;
		case 2:
		case 3: 
			System.out.println("����"); break;
		case 4:
		case 5:
		case 6:
			System.out.println("����"); break;
		default :
			System.out.println("���"); break;
		}
	}

}
