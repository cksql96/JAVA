package practice;
import java.util.Scanner;

class Student{
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
	
}

public class classArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber;
		
		System.out.print("입력 인원 : ");
		inputNumber = s.nextInt();
		
		Student[] student = new Student[inputNumber];
		
		System.out.println("\n학생 정보 입력");
		System.out.println("---------------------");
		
		for ( int i = 0; i < student.length; i++) {
			student[i] = new Student();
			
			System.out.print(" Name : ");
			student[i].setName(s.next());
			
			System.out.print(" Age : ");
			student[i].setAge(s.nextInt());
			
			System.out.print("Number : ");
			student[i].setPhoneNumber(s.next());
			s.nextLine();
			
			System.out.print("Skill : ");
			student[i].setSpecialSkill(s.nextLine());
			
			System.out.print("Address : ");
			student[i].setAddress(s.nextLine());
			System.out.println();
		}
		System.out.println("\n학생 정보 출력");
		System.out.println("-----------------------");
		
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}

	}

}
