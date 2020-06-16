package TempCh6;

public class Singleton1 {
	
	
	static Singleton1 객체 = new Singleton1();					//static이 없으면 exception in Thread무한으로 뜸
																//또한 아래 메소드에서 사용 못함
	Singleton1() {}
	
	static Singleton1 getInstance() {							//static 없으면 main part에서 Singleton1.getInstance
		return 객체;												//사용 못함
	}
	
}
