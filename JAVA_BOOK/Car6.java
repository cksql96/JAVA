package TempCh6;

public class Car6 {

	/*static*/ int speed;
	
	/*static*/ void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//speed = 60;						//static�� ������ ��� ����
		//run();							//static�� ������ ��� ����
		
		Car6 myCar = new Car6();
		myCar.speed= 60;
		myCar.run();
		
	}

}
