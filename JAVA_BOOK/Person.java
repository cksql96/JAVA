package TempCh6;

public class Person {

	final String nation = "Korea";		//final �� �� ������ �׳� ����. �ƴϸ� �¾���� korea���� �ٲܼ� ��� final �ص�.
	final String ssn;					//final �� �� ������ �ֹι�ȣ�� �ٲܼ� ���.
	String name;						//final �� �� �� ������ ��� ����
	
	public Person(String ssn, String name) {				//final �ʵ� �ʱⰪ�ִ� ��� 2����.
		this.ssn = ssn;										//1.�ʵ� ����
		this.name = name;									//2.�����ڿ��� �ִ°�.
	}
}
