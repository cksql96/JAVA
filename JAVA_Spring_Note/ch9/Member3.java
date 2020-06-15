package ch9;

public class Member3 {
	//파란색 맴버 변수
	String name, tel, address;
	
	Member3() {
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	
	
	
	
	Member3(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
		//좌변은 맴버변수 를 나타내고 우변은 지역변수를 나타냄
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
		
	}
}
