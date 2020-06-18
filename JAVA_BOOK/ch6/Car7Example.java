package TempCh6;

import example.MakeGetterAndSetter;

public class Car7Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car7 myCar = new Car7();
			
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("-50으로 준 후의 현재속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("60으로 준 후의 현재속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("멈춤을 준 후의 현재속도 : " + myCar.getSpeed());
			
	}

}
