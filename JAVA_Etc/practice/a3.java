package practice;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a = ~70;
		// ~?? -> (?? * (-1)) - 1
		System.out.println("a = ~70�϶� = " + a);
		System.out.println();
		
		int b = 10;
		int c = 20;
		int d = 2;
		System.out.println("b = " + b + ", c = " + c);
		b += c;
		System.out.println("b += c�� b��" + b);
		System.out.println("b += c�� c��" + c);
		System.out.println();
		System.out.println("b = " + b + ", c = " + c);
		b -= c;
		System.out.println("b -= c�� b��" + b);
		System.out.println("b -= c�� c��" + c);
		System.out.println();
		System.out.println("b = " + b + ", c = " + c);
		b *= c;
		System.out.println("b *= c�� b��" + b);
		System.out.println("b *= c�� c��" + c);
		System.out.println();
		System.out.println("b = " + b + ", c = " + c);
		b /= c;
		System.out.println("b /= c�� b��" + b);
		System.out.println("b /= c�� c��" + c);
		System.out.println();
		
		
		System.out.println("b = " + b + ", d = " + d);
		b += d;
		System.out.println("b += d�� b��" + b);
		System.out.println("b += d�� d��" + d);
		System.out.println();
		System.out.println("b = " + b + ", d = " + d);
		b -= d;
		System.out.println("b -= d�� b��" + b);
		System.out.println("b -= d�� d��" + d);
		System.out.println();
		System.out.println("b = " + b + ", d = " + d);
		b *= d;
		System.out.println("b *= d�� b��" + b);
		System.out.println("b *= d�� d��" + d);
		System.out.println();
		System.out.println("b = " + b + ", d = " + d);
		b /= d;
		System.out.println("b /= d�� b��" + b);
		System.out.println("b /= d�� d��" + d);
	}

}
