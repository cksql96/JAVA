package practice;
import java.util.Scanner;

class Students{
	private String name;
	private int age;
	private String phoneNumber;
	private String specialSkill;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void print() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Number : " + this.phoneNumber);
		System.out.println("Skill : " + this.specialSkill);
		System.out.println("Address : " + this.address + "\n");
	}
	public void getInfor() {
		
	}
}

public class classArray2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber;
		
		System.out.print("�Է� �ο� : ");
		inputNumber = s.nextInt();
		
		Students[] student = new Students[inputNumber];
		
		System.out.println("\n�л� ���� �Է�");
		System.out.println("---------------------");
		
		
		//s.nextInt �� ������ �����ٿ� s.nextLine�� �ϳ� �ȸ�����ָ� �ǳ� �ڴ�.
		//���� s.next�� ������ �ƴϸ� ���� ������ �ް������ �� ���� s.nextLine�� �ϳ� �׳� ���������Ѵ�.
		//s.next �� �����̽��� �����̸� �ȵǰ�, s.nextLine�� �����̽��ٵ� �޾��ش�.
		for ( int i = 0; i < student.length; i++) {
			student[i] = new Students();
						
			System.out.print(" Name : ");
			student[i].setName(s.next());
			
			System.out.print(" Age : ");
			student[i].setAge(s.nextInt());
			
			//s.nextLine();
			
			System.out.print("Number : ");
			student[i].setPhoneNumber(s.next());
			
			System.out.print("Skill : ");
			student[i].setSpecialSkill(s.next());
			
			System.out.print("Address : ");
			student[i].setAddress(s.next());
			System.out.println();
		}
		System.out.println("\n�л� ���� ���");
		System.out.println("-----------------------");
		
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}

	}

}
