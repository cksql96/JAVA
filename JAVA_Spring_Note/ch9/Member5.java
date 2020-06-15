package ch9;

public class Member5 {
	String name, tel, address;
	
	Member5() {
		this("no name");											//1.	2번째로 간다.
		System.out.println("파라메터 없는 생성자의 this() 후 ");			//7.	프린트한다.
		System.out.println("------------------------------");
	}
		
	Member5(String name) {
		this("test", "222", "뉴욕");									//2.	3번째로 간다.
		System.out.println("파라메터 1개 갖는 생성자의 this() 후 ");			//6.	프린트한다.
									
		System.out.println("name 파라메터 : " + name);						//this.name 을 안넣을시, String name값이 들어가므로
		System.out.println("this.name 파라메터 : " + this.name);			//변경전의 것인 no name이 들어간다.
		System.out.println("this.tel 파라메터 : " + this.tel);				//이 생성자는 Member5(String name) 이므로	
		System.out.println("address 파라메터 : " + address);				//name 만 this.name을 써줘도 된다.
		System.out.println("------------------------------");
	}
	
	
	Member5(String name, String tel, String address) {
		System.out.println("파라메터 3개를 갖는 생성자 호출됨");				//3.	프린트한다.
		this.name = name;											//4.	넣는다.
		this.tel = tel;
		this.address = address;
		System.out.println("3번째 생성자임. 다 입력 완료!!");				//5.	프린트한다.
		System.out.println("------------------------------");
	}
	
	
	
	void print() {													//8.	m.print로 인해 프린트한다.
		System.out.println("name : " +name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
