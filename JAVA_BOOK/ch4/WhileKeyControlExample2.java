package ch4;

import java.io.IOException;

public class WhileKeyControlExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode !=10) {
				System.out.println("----------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("----------------------");
				System.out.println("���� : ");
			}
		
			keyCode = System.in.read() - 48;
			System.in.read();
			System.in.read();
			
			System.out.println(keyCode);
			
			if(keyCode == 1)
			{
				speed++;
				System.out.println("���� �ӵ� = " +speed);
			}
			else if(keyCode == 2)
			{
				speed--;
				System.out.println("���� �ӵ� = " +speed);
			}
			else if(keyCode == 3) 
			{
				System.out.println("���α׷��� �����մϴ�!");
				run = false;
			}
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		}
	}

}
