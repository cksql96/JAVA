package practice;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a = ~70;
		// ~?? -> (?? * (-1)) - 1
		System.out.println("a = ~70일때 = " + a);
		System.out.println();
		
		int b = 10;
		int c = 20;
		int d = 2;
		System.out.println("b = " + b + ", c = " + c);
		b += c;
		System.out.println("b += c의 b값" + b);
		System.out.println("b += c의 c값" + c);
		System.out.println();
		System.out.println("b = " + b + ", c = " + c);
		b -= c;
		System.out.println("b -= c의 b값" + b);
		System.out.println("b -= c의 c값" + c);
		System.out.println();
		System.out.println("b = " + b + ", c = " + c);
		b *= c;
		System.out.println("b *= c의 b값" + b);
		System.out.println("b *= c의 c값" + c);
		System.out.println();
		System.out.println("b = " + b + ", c = " + c);
		b /= c;
		System.out.println("b /= c의 b값" + b);
		System.out.println("b /= c의 c값" + c);
		System.out.println();
		
		
		System.out.println("b = " + b + ", d = " + d);
		b += d;
		System.out.println("b += d의 b값" + b);
		System.out.println("b += d의 d값" + d);
		System.out.println();
		System.out.println("b = " + b + ", d = " + d);
		b -= d;
		System.out.println("b -= d의 b값" + b);
		System.out.println("b -= d의 d값" + d);
		System.out.println();
		System.out.println("b = " + b + ", d = " + d);
		b *= d;
		System.out.println("b *= d의 b값" + b);
		System.out.println("b *= d의 d값" + d);
		System.out.println();
		System.out.println("b = " + b + ", d = " + d);
		b /= d;
		System.out.println("b /= d의 b값" + b);
		System.out.println("b /= d의 d값" + d);
	}

}
