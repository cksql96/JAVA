package ch13.abstractEx;

public abstract class Parent4 extends GrandParent4{
	
	//두개의 추상메소드를 상속받았기 때문에, 두개 모두 구현해야 완성된 클래스가 되지만, 
	//print한개만 구현했으므로, parent는 추상클래스이며 객체를 가질수 없다.
	
	@Override
	public void print() {
		System.out.println("parent");
		System.out.println("name = " + name);
	}

}
