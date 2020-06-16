package TempCh6;

public class Singleton1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton1 obj1 = Singleton1.getInstance();		
		Singleton1 obj2 = Singleton1.getInstance();		
		
		Singleton1 obj3 = new Singleton1();				
		Singleton1 obj4 = new Singleton1();				
		
		System.out.println("getInstance 메소드 사용시");
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		}
		else
		{
			System.out.println("다른 객체");
		}
		
		System.out.println();
		System.out.println("메모리 할당했을시");
		if(obj3 == obj4) {
			System.out.println("같은 객체");
		}
		else
		{
			System.out.println("다른 객체");
		}
		
	}

}
