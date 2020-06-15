package ch7;

public class Child1 extends Parent1 {

	public void printInfo() {
		
		{
		
			System.out.println();
			System.out.println("나는 Child1의 초기화 블록이야. Parent1에서의 변수선언된것들을 불러와볼게");
			//System.out.println(a);		//안댐
			//System.out.println(b);		//안댐
			//System.out.println(c);		//안댐
			System.out.println(d);
			System.out.println();
		}
		
		
	}
	
	
	
}
