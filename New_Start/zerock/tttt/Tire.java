package tttt;


public class Tire implements ITire {

	public void punkFront() throws PunkException {
		throw new PunkException("앞바퀴 펑");
	}

	@Override
	public void punkBack() throws PunkException {
		throw new PunkException("뒷바퀴 펑");
	}

	@Override
	public void changeTire() {
		System.out.println("타이어를 교체합니다.");
	}

	
} // end class
