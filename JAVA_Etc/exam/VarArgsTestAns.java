package exam;

public class VarArgsTestAns {
	static void foo(String str, int... a){
		System.out.print(str + " ");
		for(int i : a) 
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static void main(String args[] ){
	
		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���", 1, 2);
		foo("�� �־�");
		
	}
					 
	
	
}

