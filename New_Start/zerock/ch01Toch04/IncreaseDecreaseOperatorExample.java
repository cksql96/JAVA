package ch01Toch04;

public class IncreaseDecreaseOperatorExample {
	
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------x++, ++x---------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("--------y--, --y---------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("--------z=x++---------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------z=++x---------------------");
		z= ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------z=++x + y++---------------------");
		z= (++x) + (y++);
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
		System.out.printf("%d \t", x);
		
		
		
		
	}	//end main

}	//end class
