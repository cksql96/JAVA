package practice;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A';			//���ڸ� ���� ����
		char c2 = 65;			//10������ ����
		char c3 = '\u0041';		//16������ ����
		
		int a = c1;				//�����ڵ带 ���ڷ� ���
		int b = 96;	
		char c4 = (char)b;		//���ڸ� �����ڵ��
		
		
		/*
		 * int var1 = 10; 
		 * int var2 = 012; 
		 * int var3 = 0xA;
		 * 
		 * System.out.println(var1); System.out.println(var2); System.out.println(var3);
		 * 
		 * int var5 = 40; char a = (char)var5;
		 * 
		 * System.out.println(a);
		 */
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("C1  = " + c1);
		System.out.println("C2  = " + c2);
		System.out.println("C3  = " + c3);		//char�� ������ ���ڷ� �ֵ� 10������ �ֵ� 16������ �ֵ� ���� A�� �����ȴ�.
		
		System.out.println("Char C1 �� Int a ������ ġȯ������ = " + a);
		//���ڸ��� ���ڷ� �˰������ int�� �� ������ �����ؼ� ������ش�.
		System.out.println("Int b�� Char c4 ������ ġȯ ������ = " + c4);
		//���ڸ� �����ڵ�� �˰������ char�� �� ������ �����ؼ� ������ش�.
	}

}
