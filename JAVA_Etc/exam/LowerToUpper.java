package exam;
import java.io.IOException;

public class LowerToUpper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char input = 0;
		System.out.println("���� �ҹ��ڳ� �빮�� �ƹ��ų� �Է��ϼ���");
		input = (char) System.in.read();
		System.out.println(input);
		
		int a = 0;
		a = (int) input;
		
		if(a >= 65 && a<=90)
		{
			System.out.println("�빮�� �Դϴ�.");
			System.out.println("�빮�ڸ� �ҹ��ڷ� �ٲپ����� = " + (char)(a+32));
		}
		else if(a >= 97 && a <=122)
		{
			System.out.println("�ҹ����Դϴ�.");
			System.out.println("�ҹ��ڸ� �빮�ڷ� �ٲپ����� = " + (char)(a-32));
		}
		else
		{
			System.out.println("���� �ҹ��� �빮�ڸ� �Է¾��ϼ̽��ϴ�. ���α׷� �����մϴ�!");
		}
				
		
	}

}
