package exam;

public class VarArgsTestAns {
	static void foo(String str, int... a){
		System.out.print(str + " ");
		for(int i : a) 
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static void main(String args[] ){
	
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
		
	}
					 
	
	
}

