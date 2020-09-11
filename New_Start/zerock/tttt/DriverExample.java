package tttt;


public class DriverExample {

	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bicycle bicycle = new Bicycle();
		
		driver.drive(bicycle);
		driver.leftDirection(bicycle);
		driver.stop(bicycle);
		driver.punkF(bicycle);
		driver.changeT(bicycle);
		
	} // main
	
} // end class
