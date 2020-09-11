package tttt;


public class Driver {
	String driverName = "jkl";
	
	public void drive(Bicycle bicycle) {
		bicycle.pedal();
		bicycle.run();
	}
	
	public void stop(Bicycle bicycle) {
		bicycle.brake();
		bicycle.stop();
	}
	
	public void leftDirection(Bicycle bicycle) {
		bicycle.turnLeft();
	}
	
	public void rightDirection(Bicycle bicycle) {
		bicycle.turnRight();
	}
	
	public void forwardDirection(Bicycle bicycle) {
		bicycle.goForward();
	}
	
	public void punkF(Bicycle bicycle) {
		try {
			bicycle.punkFront();
		} catch (PunkException e) {
			e.printStackTrace();
		}
	}
	
	public void punkB(Bicycle bicycle) {
		try {
			bicycle.punkBack();
		} catch (PunkException e) {
			e.printStackTrace();
		}
	}
	
	public void changeT(Bicycle bicycle) {
		bicycle.changeTire();
	}
	
	
} // end class