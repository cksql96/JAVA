package ch9;

public class Member3 {
	//�Ķ��� �ɹ� ����
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
		//�º��� �ɹ����� �� ��Ÿ���� �캯�� ���������� ��Ÿ��
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
		
	}
}
