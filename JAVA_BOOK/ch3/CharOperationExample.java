package ch3;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; 더하면 int타입으로 변환이 되기때문에 컴파일 에러가 나므로 강제형변환 char로 해줘야 한다.
		char c3 = (char)(c2 + 1);
		int c4 = c2 + 1; // 이렇게 하면 int인 정수로 변환되어 나온다.
		char c5 = (char)c4; // int 인 c4를 숫자 말고 문자로 보고싶으면 다시 강제형변환을 해준다.
		System.out.println("c1 : " +c1);
		System.out.println("c2 : " +c2);
		System.out.println("c3 : " +c3);
		System.out.println("c4 : " +c4);
		System.out.println("c5 : " +c5);
	}

}
