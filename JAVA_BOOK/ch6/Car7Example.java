package TempCh6;

import example.MakeGetterAndSetter;

public class Car7Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car7 myCar = new Car7();
			
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("-50���� �� ���� ����ӵ� : " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		System.out.println("60���� �� ���� ����ӵ� : " + myCar.getSpeed());
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("������ �� ���� ����ӵ� : " + myCar.getSpeed());
			
	}

}
