package ch3;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "�ٺ�";
		String strVar2 = "�ٺ�";
		String strVar3 = new String("�ٺ�");
		String strVar4 = "���";
		
		System.out.println(strVar1 == strVar2);				//���� ��ü������ ���ڿ� ��	T
		System.out.println(strVar1 == strVar4);				//���� ��ü������ ���ڿ� ��	F
		System.out.println(strVar1 == strVar3);				//���� ��ü������ ���ڿ� ��	F
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));		//���ڿ��� ��				T
		System.out.println(strVar1.equals(strVar3));		//���ڿ��� ��				T
		System.out.println(strVar1.equals(strVar4));		//���ڿ��� ��				F
	}

}
