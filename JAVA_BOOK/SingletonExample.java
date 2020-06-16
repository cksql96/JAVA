package TempCh6;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Singleton obj3 = new Singleton();				//생성자가 private이라 안댐
		//Singleton obj4 = new Singleton();				//생성자가 private이라 안댐
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		}
		else
		{
			System.out.println("다른 객체");
		}
		
		
	}

}
