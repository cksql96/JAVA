package TempCh7;

public class SuperConChild extends SuperConParent{

	private int c = 3;
	
	public SuperConChild(int a, int b, int c) {
		//System.out.println(); 		//super가 맨앞에 안오면 컴파일 에러남.
		//this.a = a;					//컴파일 에러
		//this.b = b;					//컴파일 에러
		super(a,b); 					//상위 클래스의 생성자를 호출하여 필요한 파라메터를 전달.
		this.c = c;						
		System.out.println("SuperConChild의 생성자");
	}
	
	@Override
	public void print() {
		super.print();							//a와 b를 출력해주는 SuperConParent의 print()를 호출
		System.out.println("c = " + c);			//c의 값을 출력해주는 SuperConChild의 print()를 호출
	}
}
