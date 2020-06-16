package TempCh6;

public class Car6 {

	/*static*/ int speed;
	
	/*static*/ void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//speed = 60;						//static을 넣으면 사용 가능
		//run();							//static을 넣으면 사용 가능
		
		Car6 myCar = new Car6();
		myCar.speed= 60;
		myCar.run();
		
	}

}
