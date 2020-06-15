package ch4;

public class Ex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;
		
		System.out.println("수를 입력");
		
		a = System.in.read() - 48;
		System.in.read();
		System.in.read();
		System.out.println(a + " 입력했음");
		
		System.out.println("같은 수를 입력");
		b = System.in.read();
		System.out.println(b + "입력했음");
		
		
	}

}
