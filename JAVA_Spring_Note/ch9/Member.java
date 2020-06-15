package ch9;

public class Member {
	String name; 
	String tel;
	String address;
	
	Member(){		//생성자
		//초기화
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	
	//메소드
	void setMemberData(String _name, String _tel, String _address) {
		name = _name;
		tel = _tel;
		address = _address;
		
		/*or
		 * void setMemberData(String name, String tel, String address) 
		 * 	 	this.name = name; 
		 * 		this.tel = tel; 
		 * 		this.address = address;
		 */
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
}
