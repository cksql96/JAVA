package ch3;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result 1 = " + result1);
		System.out.println("result 2 = " + result2);
		
		short s = 100;
		//short result3 = -s; // 컴파일 에러
		//short result3 = (short)-s; // 이러면 강제 형변환을 통해 에러가 안난다.
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}

}
