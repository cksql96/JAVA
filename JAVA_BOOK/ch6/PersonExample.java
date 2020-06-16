package TempCh6;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "을지문덕";
		System.out.println();
		System.out.println("계명후");
		System.out.println(p1.name);
	}

}
