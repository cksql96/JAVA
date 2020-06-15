package ch3;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2= 1;
		double v3 = 1.0;
		System.out.println(v2==v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false
		System.out.println();
		System.out.println((float)v4 ==v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10));//true
		
		System.out.println(v4);
		System.out.println(v5);
		
		int a = 1;
		double b = a - v4;			//0.9
		double c = a - v5;			//0.899999~~~
		float d = a - (float)v4;	//0.9
		float e = a - v5;			//0.9
		float f = (float) (a-v4);	//0.9
		
		System.out.println();
		System.out.println(b);		//0.9
		System.out.println(c);		//0.899999~~~
		System.out.println(d);		//0.9
		System.out.println(e);		//0.9
		System.out.println(f);		//0.9
	}

}
