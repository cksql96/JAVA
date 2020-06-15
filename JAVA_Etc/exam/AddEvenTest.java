package exam;
import java.util.*;
public class AddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		
		do {
			System.out.print("양의 정수를 입력. 단 음수면 입력 종료.");
			input = sc.nextInt();
			if(input % 2 == 0)
			{
				sum += input;
			}
		}while(input >= 0);
		
		System.out.println("입력한 값중 짝수의 합은 : " + sum);
		
		
	}

}
