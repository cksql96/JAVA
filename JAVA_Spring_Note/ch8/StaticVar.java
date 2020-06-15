package ch8;

public class StaticVar {

	static int a=1;		//초기화는 한번만 진행한다.
	int b=1;			//일반 맴버 변수 b를 1로 초기화
	
	void staticTest() {
		a++;
		b++;
		System.out.println("static var a = " + a);
		System.out.println("non static var b = " +b);
	}
	
}
