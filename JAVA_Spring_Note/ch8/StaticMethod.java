package ch8;

public class StaticMethod {

	static int a;
	int b;
	
	static void test(int x) {
		int sum = 0;
		// sum = a + b + x;   - > b 는 사용 불가 static이 아니라서.
		sum = a + x;
		System.out.println("sum = " + sum);
		//test2(); -> static 이 아니여서.
		test3();
	}
	
	void test2() {
		System.out.println("test2");
	}
	
	static void test3() {
		System.out.println("test3");
	}
}
