package ch3;

public class OperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5, y = 5, z=0;
		
		z = ++x + y++;
		//x =  , y =  , z =  
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		z = x++ + ++y;
		//x =  , y =  , z =  
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		z = ++x + --y + 10;
		//x =  , y =  , z =  
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		
		z = x-- + --y;
		//x =  , y =  , z =  
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		z = --x + y--;
		//x =  , y =4  , z =  
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();

		z = --x + y-- + x++ + x++;
		// z = x(5) + y(4) + x(5)  +x(6)
		//x =7  , y =3  , z =  20
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
	}

}
