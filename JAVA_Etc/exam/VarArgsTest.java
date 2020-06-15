package exam;

public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
		
	}
					  
	public static void foo(String a, int b)
	{
		System.out.println(a + " " + b);
		System.out.println("첫번째 foo");
		System.out.println();
	}
						
	public static void foo(String a, int b, int c)
	{
		System.out.println(a + " " + b + " " + c);
		System.out.println("두번째 foo");
		System.out.println();
	}
	public static void foo(String a)
	{
		System.out.println(a);
		System.out.println("세번째 foo");
		System.out.println();
	}
	
}
