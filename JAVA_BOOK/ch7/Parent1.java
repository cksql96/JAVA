package ch7;

public class Parent1 {

	int d = 0;
	
	
	Parent1 () {
		System.out.println("난 Parent1 생성자야. 여기에 a 변수를 줘볼게");
		int a = 0;
		System.out.println("---------------------------------------------");
	}
	
	static {
		System.out.println("난 static 블록이야. 여기에 b 변수를 줘볼게");
		int b = 0;
		System.out.println("---------------------------------------------");
	}
	
	{
		System.out.println("난 초기화 블록이야. 여기에 c 변수를 줘볼게");
		int c = 0;
		System.out.println("---------------------------------------------");
	}
	
	
	
}
