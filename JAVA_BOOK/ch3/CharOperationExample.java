package ch3;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; ���ϸ� intŸ������ ��ȯ�� �Ǳ⶧���� ������ ������ ���Ƿ� ��������ȯ char�� ����� �Ѵ�.
		char c3 = (char)(c2 + 1);
		int c4 = c2 + 1; // �̷��� �ϸ� int�� ������ ��ȯ�Ǿ� ���´�.
		char c5 = (char)c4; // int �� c4�� ���� ���� ���ڷ� ��������� �ٽ� ��������ȯ�� ���ش�.
		System.out.println("c1 : " +c1);
		System.out.println("c2 : " +c2);
		System.out.println("c3 : " +c3);
		System.out.println("c4 : " +c4);
		System.out.println("c5 : " +c5);
	}

}
