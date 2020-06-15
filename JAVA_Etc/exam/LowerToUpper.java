package exam;
import java.io.IOException;

public class LowerToUpper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char input = 0;
		System.out.println("영어 소문자나 대문자 아무거나 입력하세요");
		input = (char) System.in.read();
		System.out.println(input);
		
		int a = 0;
		a = (int) input;
		
		if(a >= 65 && a<=90)
		{
			System.out.println("대문자 입니다.");
			System.out.println("대문자를 소문자로 바꾸었을때 = " + (char)(a+32));
		}
		else if(a >= 97 && a <=122)
		{
			System.out.println("소문자입니다.");
			System.out.println("소문자를 대문자로 바꾸었을때 = " + (char)(a-32));
		}
		else
		{
			System.out.println("영어 소문자 대문자를 입력안하셨습니다. 프로그램 종료합니다!");
		}
				
		
	}

}
