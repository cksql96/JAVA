package ch6;

public class Method2Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myHeight = 175.9;
		
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		
		byEveryone();
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("my age is " + age);
		System.out.println("and my hegiht is " + height + "cm \n");
		}
	public static void byEveryone() {
		System.out.println("See you next time" );
	}

}
