package com.zerock.casting;


public class TTTexample {
	
	
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent p = child;
		Child c = (Child) child;
		
		
		
		//이 상태로 하면 되지만...
		//자동형변환으로, 자식이 부모한테,
//		Parent parent = new Child();
		//강제형변환, 자식이 부모한테 간 상태에서,
		//부모가 자식한테다시 감.
//		Child child = (Child) parent;
		

		//이렇게 하면 안된다.
		Parent pa = new Parent();
		//강제형변환
		//여기서 바로 런타임 익셉션 오류가 뜬다.
		Child ca = (Child) pa;
		//즉 다형성에서의 강제형변환의 조건
		//한번은 반드시 부모한테 간다음에, 다시
		//자식객체로 돌아오고자 할때.
		
		ca.field2 = "asdf";
		ca.field1 = "asdf";
		System.out.println(ca.field1);
		System.out.println(ca.field2);
		
	}	//end main

}	//end class
