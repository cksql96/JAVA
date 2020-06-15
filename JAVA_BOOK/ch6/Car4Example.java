package ch6;

public class Car4Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car4 myCar = new Car4();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("GO");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("no need to refill the gas");
		}else {
			System.out.println("refill the gas");
		}
		
	}

}
