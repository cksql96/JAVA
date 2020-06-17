package TempCh6.접근제한1;

public class B1 {

	public B1() {
		A1 a = new A1();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;		//private라 안댐
		
		a.method1();
		a.method2();
		//a.method3();		//private이라 안댐
	}
	
}
