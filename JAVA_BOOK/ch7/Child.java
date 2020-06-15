package ch7;

public class Child extends Parent{

	private String hobby;
	public Child() {
		System.out.println("Child 생성자");
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		//System.out.println("money : " + money); // 에러발생         Child에다가 int money선언하면 사용 가능
		System.out.println("hobby : " + hobby);
		//System.out.println(babo);			//생성자 안에서 주어진 변수는 상속관계에서 쓸수없다.
		System.out.println(momo);			//생성자 밖에서 주어진 변수는 상속 받는다.
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby (String hobby) {
		this.hobby = hobby;
	}
	
	
}
