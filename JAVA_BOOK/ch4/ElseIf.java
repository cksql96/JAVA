package ch4;
import java.util.*;

public class ElseIf {
	//private static Scanner sc = new Scanner(System.in);                      // 10���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		
		//5����ó�� private static ���� �ϴ� ������ ����� �����.
		Scanner sc = new Scanner(System.in);			//new�� �޸� �Ҵ�// sc�� ��ü 
		System.out.println("���� �Է�");
		jumsu = sc.nextInt();		//Ű����� ������ �Է� 	// .�� ������� ������(�������������) // sc�� ��ü
		if(jumsu>=90) {
			System.out.println("A");
		}
		else if(jumsu>=80) {
			System.out.println("B");
		}
		else if(jumsu>=70) {
			System.out.println("C");
		}
		else if(jumsu>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
