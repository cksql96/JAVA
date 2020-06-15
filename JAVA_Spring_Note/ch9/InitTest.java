package ch9;

public class InitTest {
	int x = 5;
	static int y = 5;
	String str = "aaa";
	
	static {				//static 으로 초기화
		System.out.println("static 초기화 블록 실행전 \n y = " +y);
		y = 10;
		System.out.println("-----------------------------------Static");
	}
		
	{						//일반 초기화
		System.out.println("초기화 블록 실행전 \n x = " +x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
		x = 20;
		y = 20;
		str = "bbb";
		System.out.println("---------------------------------------Nothing");
	}
	
	InitTest() {			//생성자 초기화
		System.out.println("생성자 실행전 \n x= " + x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
		x = 30;
		y = 30;
		str = "ccc";
		System.out.println("--------------------------------------InitTest");
	}
	
	public void print() {
		System.out.println("-----------------------------------------");
		System.out.println("모든 초기화후 \n x = " +x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
	}
	
	public void print2() {
		System.out.println("-----------------------------------------");
		x = 20;
		System.out.println();
		System.out.println();
		System.out.println("x = " +x);
		System.out.println("y = " + y);
		System.out.println("str = " +str);
	}
	
	
}
