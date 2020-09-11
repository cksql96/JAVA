package tttt;


public class Bicycle {
//	Handle handle = new Handle();
	String brandName = "내자전거";
	
//	다형성  1: 조립할 부품 조립
	IHandle handle = new Handle();
	IPedal pedal = new Pedal();
	IBrake brake = new Brake();
	ITire tire = new Tire();
	
	
	public void run() {
		System.out.println("자전거가 달립니다.");
	} // run
	
	public void stop() {
		System.out.println("자전거가 멈춥니다.");
	} // stop
	
	public void turnLeft() {
		handle.turnLeft();
	} // turnLeft
	
	public void turnRight() {
		handle.turnRight();
	} // turnRight

	public void goForward() {
		handle.goForward();
	}
	
	public void pedal() {
		pedal.accelerate();
	}
	
	public void brake() {
		brake.decelerate();
	}
	
	public void punkFront() throws PunkException {
		tire.punkFront();
	}

	public void punkBack() throws PunkException {
		tire.punkBack();
	}

	public void changeTire() {
		tire.changeTire();
	}

} // end class
