package ch01Toch04;

public class InfiniteLoop {
	public static void main(String[] args)
	throws InterruptedException {
		
		while(true) {
			System.out.print('.');
			
			Thread.sleep(1000);
		}	//while
		
	}	//main

}	//end class
