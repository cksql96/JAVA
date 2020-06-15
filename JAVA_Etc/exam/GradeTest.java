package exam;
import java.util.*;
public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("등수 입력");
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("아주 잘함"); break;
		case 2:
		case 3: 
			System.out.println("잘함"); break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통"); break;
		default :
			System.out.println("노력"); break;
		}
	}

}
