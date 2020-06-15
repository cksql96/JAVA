package ch4;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(float x=0.1f;x<=1.0f;x+=0.1f) {
			System.out.println(x);
		}
		
		System.out.println();
		
		for(double y=0.1;y<=1;y+=0.1) {
			System.out.println(y);
		}
		
		System.out.println();
		
		for(double z=1.0; z>=0; z-=0.1) {
			System.out.println(z);
		}
	}

}
