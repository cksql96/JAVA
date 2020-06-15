package ch9;

public class Member2 {
	String name, tel, address;
	
	Member2() {
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	
	Member2(String name) {
		this.name = name;
		tel = "no tel";
		address = "no address";
	}
	
	/*
	Member2(String name1) {
		name = name1;
		tel = "no tel";
		address = "no address";
	}
	*/
	
	Member2(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	/*
	Member2(String name1, String tel1, String address1) {
		name = name1;
		tel = tel1;
		address = address1;
	}
	*/
	
	void print() {
		System.out.println("name : " +this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("address : " + this.address + "\n");
	}
	
}
