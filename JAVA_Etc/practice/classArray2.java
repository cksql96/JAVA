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
		
		System.out.print("입력 인원 : ");
		inputNumber = s.nextInt();
		
		Students[] student = new Students[inputNumber];
		
		System.out.println("\n학생 정보 입력");
		System.out.println("---------------------");
		
		
		//s.nextInt 를 썻으면 다음줄에 s.nextLine을 하나 안만들어주면 건너 뛴다.
		//따라서 s.next만 쓰던가 아니면 공백 포함을 받고싶으면 그 전에 s.nextLine을 하나 그냥 만들어줘야한다.
		//s.next 는 스페이스바 포함이면 안되고, s.nextLine은 스페이스바도 받아준다.
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
		System.out.println("\n학생 정보 출력");
		System.out.println("-----------------------");
		
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}

	}

}
