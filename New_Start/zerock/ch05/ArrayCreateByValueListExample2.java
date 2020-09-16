package ch05;

public class ArrayCreateByValueListExample2 {
	
	
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		
		int sum1 = 0;
		
		for(int i = 0; i <3; i++) {
			sum1 += scores[i];
		}	//end for
		
		System.out.println("총합 : " + sum1);
		
		//------------------------------------------------//
		System.out.println();
		
		int sum2 = add (new int[] {83,90,87} );
		int sum3 = add(scores);						//위에랑 같은뜻.
		
		
		int[] b = {83,90,87,90};
		int sum4 = add(b);
		
		
		int[] c = b;
		System.out.println("c[]를 보자");
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}	//end for
		System.out.println("c[]를 다봤다.\n");
		
		System.out.println("총합 : " +sum2);
		System.out.println();
		
	}	//end main
	
	public static int add(int[] a) {	//참조변수가 있을시에는, 그대로 넣어도 되고,
		int sum = 0;					//이미 배열 변수가 있으면 () 안에 그냥 넣어주면 된다.
		
		for(int i = 0; i <a.length; i++) {
			sum += a[i];
		}	//end for
		
		return sum;
	}	//end add

}	//end class
