package exam;

public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���", 1, 2);
		foo("�� �־�");
		
	}
					  
	public static void foo(String a, int b)
	{
		System.out.println(a + " " + b);
		System.out.println("ù��° foo");
		System.out.println();
	}
						
	public static void foo(String a, int b, int c)
	{
		System.out.println(a + " " + b + " " + c);
		System.out.println("�ι�° foo");
		System.out.println();
	}
	public static void foo(String a)
	{
		System.out.println(a);
		System.out.println("����° foo");
		System.out.println();
	}
	
}
