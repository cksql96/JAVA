package TempCh6;

public class ClassName {

	//�ν��Ͻ� �ʵ�
	int field1;
	//�ν��Ͻ� �޼ҵ�
	void method1() {};
	
	//���� �ʵ�
	static int field2;
	//���� �޼ҵ�
	static void method2() {};
	
	//�ʱ�ȭ ���
	{
		field1 = 10;
		method1();
		field2 = 10;
		method2();
	}
	//ClassName b = new ClassName();		//����
	//b.field1 = 10;						//����
	//b.method1();							//����
	
	//ClassName a () {
	//	return b;
	//}
	
	
	//���� ���
	static {
		//ClassName a = new ClassName();	//����
		//a.field1 = 10;					//����
		//a.method1();						//����
		//field1 = 10;						//����
		//method1();						//����
		field2 = 10;
		method2();
	}
	//�ν��Ͻ� �޼ҵ�
	void Method4() {
		this.field1 = 10;
		this.method1();
		field1 = 10;
		method1();
		field2 = 10;
		method2();
	}
	//���� �޼ҵ�
	static void Method3() {
		ClassName obj = new ClassName();
		obj.field1 = 10;
		obj.method1();
		//field1 = 10;						//����
		//this.field1 = 10;					//����
		//this.method1();					//����
		field2 = 10;
		method2();
		//this.field2 = 10;					//����
		//this.method2();					//����
	}
	
}
