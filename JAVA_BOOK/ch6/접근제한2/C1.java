package TempCh6.접근제한2;

import TempCh6.접근제한1.A1;

public class C1 {

	public C1() {
		A1 a = new A1();
		a.field1 = 1;
		//a.field2 = 1;			//default라
		//a.field3 = 1;			//private라
		
		a.method1();
		//a.method2();			//default라
		//a.method3();			//private라
	}
}
