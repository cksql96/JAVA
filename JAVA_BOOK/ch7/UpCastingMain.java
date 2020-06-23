package TempCh7;

public class UpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("UpCastingParent의 객체");
		UpCastingParent up = new UpCastingParent();
		System.out.println("up.add() = " + up.add() + "\n");
		
		System.out.println("UpCastingChild의 객체");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add() = " + uc.add());
		System.out.println("uc.sub() = " + uc.sub() + "\n");
		
		System.out.println("UpCasting된 객체");
		UpCastingParent upc = new UpCastingChild();
		//업캐스팅 객체를 생성, 타입은 부모클래스인 UpCastingParent이고,
		//생성자 호출은 자식클래스인 UpCastingChild의 것을 호출한다.
		System.out.println("upc.add() = " + upc.add() + "\n");
		//add를 호출하면 재정의된 메서드가 호출되어 x + y + z의 결과를 반환
		
		//System.out.println("upc.sub() + " + upc.sub());
		//sub()를 호출하는데, upc의 타입이 upCastingParent이므로
		//이 클래스에는 sub()이 정의되지 않음. 그래서 에러가 발생.
		//이처럼 타입은 부모, 실행되는 형태는 자식인 것을 업캐스팅이라고 한다.
		
		
		
	}

}
