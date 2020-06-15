package exam;
import java.util.*;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 0, height = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원기둥의 밑변 반지름은? : ");
		radius = sc.nextDouble();
		System.out.println("원기둥의 높이는? : ");
		height = sc.nextDouble();
		
		
		// 부피 = PI * r * r * h
		System.out.println("원기둥의 부피는 : " + (Math.PI * radius * radius * height));
	
	}

}
