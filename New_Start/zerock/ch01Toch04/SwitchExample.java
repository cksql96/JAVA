package ch01Toch04;

public class SwitchExample {
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
				
		switch(num) {			//int, character, string, 
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("3번");
				break;
			case 4:
				System.out.println("4번");
				break;
			case 5:
				System.out.println("5번");
				break;
			default:
				System.out.println("default이지롱");
				break;		//넣어도 되고 안넣어도 되고!
		}	//end switch
		
	}	//end main

}	//end class
