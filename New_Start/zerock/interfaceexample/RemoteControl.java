package com.zerock.interfaceexample;


public interface RemoteControl {
		
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드 - 자식클래스에서 아래 추상 메소드들을 
	//@Override하도록 강요.
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//만약 다 구현해놓았는데, 추가할것이 생겨서, 아래처럼
	//추상메소드를 만들면, 이 인터페이스를 상속받는 모든
	//클래스들을 싹다 바꿔야한다. 그러면 너무 힘듦...
	//그래서 나온게 default 메소드임.
//	public default void setMute(boolean mute);
	
	//default 메소드 - 객체의 기능 확장
	//추상메소드와는 달리 바로 메소드 선언을 할수있다.
	//자식객체에서, 참조명.setMute하면 쓸 수 있다.
	//@Override할 필요도 없고, 하고싶으면 해도 되고.
	// 인스턴스 메소드로 기능을 확장.
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}else {
			System.out.println("무음헤제");
		}	// if-else
	}	//setMute
	
	//static 메소드
	//default와 같은 기능이지만, 다른점은! static 이라는
	//키워드가 있다는것은, 이 인터페이스를 사용하는 모든
	//클래스들은 이 메소드를 공유를 한다.
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}	//changeBattery
	
}	//end interface
