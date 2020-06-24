package ch13.abstractEx;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandParent4 gp = new Child4();	//GrandParent4의 변수가 베이스. 메소드는 Child4꺼를 가져옴.
										//GrandParent4의 변수 Name, Age 이렇게 2개.		이것이 업 캐스팅.
		gp.name = "grand papa";
		gp.age = 90;
		//gp.hobby = "asdf";			//gp의 변수는 name과 age밖에 없으므로, hobby는 안댐.
		gp.print();						//print()에는 name age 두개가 있어서 잘 나옴.
		System.out.println("@@@@@print끝, test 시작@@@@@");
		gp.test();						//test()에는 hobby가 있으나, GrandParent4에는 hobby가 없고,
										//Child4에서 hobby를 지정 안해줘서 null값이 들어간다.
		
		System.out.println("------------------");
		Child4 c = new Child4();		//Child4의 변수가 베이스. 메소드는 Child4꺼를 가져옴
										//Child4가 GrandParent4를 상속받았으므로, Name, Age 그리고 Child4의 Hobby이렇게 3개.
		c.name = "child momo";
		c.age = 10;
		c.hobby = "study";
		
		c.print();
		System.out.println("@@@@@print끝, test 시작@@@@@");
		c.test();
		
		System.out.println("------------------");
		c.parentPrint();
		
	}

}
