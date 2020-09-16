package ch01Toch04;

public class IfDiceExample {
	
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		
//		for(int i = 0; i <= 10; i++) {
//			int num = (int)(Math.random() * 5) + 36;
//			System.out.print(num + " ");
//		}
		
		if(num ==1) {
			System.out.println("1번");
		}else if(num==2) {
			System.out.println("2번");
		}else if(num==3) {
			System.out.println("3번");
		}else if(num==4) {
			System.out.println("4번");
		}else if(num==5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}	//end multiple - if
		
		
	}	//end main

}	//end class
