package com.zerock.casting;


public class ChildExample {
	
	
	public static void main(String[] args) {
		//다형성2 : 부모타입의 변수에 자식타입의 객체 대입
		//이때, 자식객체는 부모타입으로 자동형변환 되어 대입
		//즉 부모품에 완전히 안겨서 자식이 안보이게 됌.
		//보이는 거라곤, 부모밖에 안보여서, 부모클래스에
		//정의된 필드와 메소드만 사용 가능.
		
		Parent parent = new Child();
		//Child 에 Override가 되어있으면,
		//Override를 표출한다.
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		//------------------------//
		//강제형변환(casting)을 통해, 부모품에서 다시
		//객체를 끄집어내오는 코드.
		Child child = (Child) parent;
		
		child.field2 = "yyy";
		child.method3();
		child.field1 = "aaa";
		child.method1();
		child.method2();
		
		System.out.println(child.field2);
		System.out.println(child.field1);
		
	}	//end main

}	//end class
