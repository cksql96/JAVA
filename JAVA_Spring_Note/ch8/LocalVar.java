package ch8;

public class LocalVar {
	int memVar;		//맴버 변수 -> 특별히 지정 안되면 0으로 초기화
	
	void localTest() {
		int a = 10; 
		int c;		//지역 변수 -> 특별히 지정 안되면 garbage collection이 뜸
		
		{
			int b = 20;
			System.out.println("블록 안");
			System.out.println("a = " +a + ", b = " +b);
		}
		
		int b = 30;
		System.out.println("블록 밖");
		System.out.println("a = " + a + ", b = " + b);
		
		System.out.println("값 할당 전의 memVar = " + memVar);
		memVar = 100;
		System.out.println("값 할당 후의 memVar = " + memVar);
	}
	
	void printVar() {
		System.out.println("memVar = " + memVar);
	}

}