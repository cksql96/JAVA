package exam;
import java.util.*;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 0, height = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� �غ� ��������? : ");
		radius = sc.nextDouble();
		System.out.println("������� ���̴�? : ");
		height = sc.nextDouble();
		
		
		// ���� = PI * r * r * h
		System.out.println("������� ���Ǵ� : " + (Math.PI * radius * radius * height));
	
	}

}
