package TempCh7;

public class SuperChild extends SuperParent{

	private int a = 20;			//상속받은 필드를 또 선언하면 하위클래스에서 상위클래스의 필드는 숨겨진다.
								//SuperParent도 a를 선언했음.
	
	public SuperChild() {
		super();
		System.out.println("나는야 자식 생성자");
	}
	
	@Override
	public void print() {
		System.out.println("SuperChild의 print()");
		System.out.println("a = " + a + "\n");
		SuperCall();				//이거를 굳이 메소드로 안써도 불러지긴 한다. 슈퍼를 쓸때.
		System.out.println();
		System.out.println("super.a로 불렀을때 - " + super.a);
		System.out.println("a로 불렀을때 - " +a);	
	}
	
	//상위 클래스의 필드와 메서드에 접근하는 메서드
	public void SuperCall() {
		System.out.println("super.a = " + super.a);
		super.print();
	}
	
	
	
}
