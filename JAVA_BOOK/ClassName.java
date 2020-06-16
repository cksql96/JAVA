package TempCh6;

public class ClassName {

	//인스턴스 필드
	int field1;
	//인스턴스 메소드
	void method1() {};
	
	//정적 필드
	static int field2;
	//정적 메소드
	static void method2() {};
	
	//초기화 블록
	{
		field1 = 10;
		method1();
		field2 = 10;
		method2();
	}
	//ClassName b = new ClassName();		//가능
	//b.field1 = 10;						//에러
	//b.method1();							//에러
	
	//ClassName a () {
	//	return b;
	//}
	
	
	//정적 블록
	static {
		//ClassName a = new ClassName();	//가능
		//a.field1 = 10;					//가능
		//a.method1();						//가능
		//field1 = 10;						//에러
		//method1();						//에러
		field2 = 10;
		method2();
	}
	//인스턴스 메소드
	void Method4() {
		this.field1 = 10;
		this.method1();
		field1 = 10;
		method1();
		field2 = 10;
		method2();
	}
	//정적 메소드
	static void Method3() {
		ClassName obj = new ClassName();
		obj.field1 = 10;
		obj.method1();
		//field1 = 10;						//에러
		//this.field1 = 10;					//에러
		//this.method1();					//에러
		field2 = 10;
		method2();
		//this.field2 = 10;					//에러
		//this.method2();					//에러
	}
	
}
