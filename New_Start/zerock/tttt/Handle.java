package tttt;


public class Handle implements IHandle {

	@Override
	public void turnLeft() {
		System.out.println("왼쪽으로 갑니다.");
	} // turnLeft

	@Override
	public void turnRight() {
		System.out.println("오른쪽으로 갑니다.");
	} // turnRight

	@Override
	public void goForward() {
		System.out.println("직진합니다.");
	} // goForward

	
} // end class
