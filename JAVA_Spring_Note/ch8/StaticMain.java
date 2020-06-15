package ch8;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar v1 = new StaticVar();
		System.out.println("v1에서 출력");					//static 이 붙으면 클래스에서 계속 진행이 된다. 그 값이 유지가 된다.
		v1.staticTest();								//그러나 없으면 원래 주어진 값이 계속 초기화가 된다.
														//					v1		v2			v3
		StaticVar v2 = new StaticVar();					//static int a = 1, ++ 2,	유지 ++ 3,	유지 ++ 4,	
		System.out.println("v2에서 출력");					//int b = 1, 		++ 2, 	초기화 ++ 2,	초기화 ++ 2
		v2.staticTest();
		
		StaticVar v3 = new StaticVar();
		System.out.println("v3에서 출력");
		v3.staticTest();
		
		v1.a = 50;										//마찬가지로 a는 static이 붙어서 계속 이어간다.
		v1.b = 500;										//하지만 b는 없어서 원래 주어진 값으로 계속 초기화가 된다.
														//static은 유지	v1		v2		v3
		System.out.println("v1.a = " + v1.a);			//v1.a = 50, 	a = 50		a = 50	a = 50
		System.out.println("v1.b = " + v1.b);			//v1.b = 500, 	b = 500		b = 2	b = 2
		
		System.out.println("v2.a = " + v2.a);
		System.out.println("v2.b = " + v2.b);
		
		System.out.println("v3.a = " + v3.a);
		System.out.println("v3.b = " + v3.b);
		
		System.out.println("StaticVar.a = " + StaticVar.a);
	}

}
