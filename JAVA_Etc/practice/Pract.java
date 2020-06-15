package practice;
import java.util.*;

class people{
	private String name, PhoneNumber, Address;
	private int age;
	private float height, weight;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public void print() {
		System.out.println("Name \t\t\t: " + this.name);
		System.out.println("Age \t\t\t: " + this.age);
		System.out.println("Height \t\t\t: " + this.height);
		System.out.println("Weight \t\t\t: " + this.weight);
		System.out.println("Phone Number \t\t: " + this.PhoneNumber);
		System.out.println("Address \t\t: " + this.Address + "\n");
	}
}
public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int inputNumber;
		
		System.out.print("몇명 입력? : " );
		inputNumber = s.nextInt();
		
		people[] p = new people[inputNumber];
		
		System.out.println("입력칸 \n-----------------------");
		
		for(int i = 0; i < p.length; i++) {
			p[i] = new people();
			
			System.out.print("Name : ");
			p[i].setName(s.next());
			
			System.out.print("Age : ");
			p[i].setAge(s.nextInt());
			
			System.out.print("Height : ");
			p[i].setHeight(s.nextFloat());
			s.nextLine();
			
			System.out.print("Weight : ");
			p[i].setWeight(s.nextFloat());
			
			System.out.print("Phone Number : ");
			p[i].setPhoneNumber(s.next());
			
			System.out.print("Address : ");
			p[i].setAddress(s.next());
			
			System.out.println();
		}
		
		System.out.println("\n사람 정보 출력 \n-------------------");
		
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

	}

}
