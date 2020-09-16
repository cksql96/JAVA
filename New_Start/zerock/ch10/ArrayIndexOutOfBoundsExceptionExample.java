package ch10;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	
	public static void main(String[] args) {
		
		if(args.length != 0) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			
			System.out.println("args[0] = " + data1);
			System.out.println("args[1] = " + data2);
			System.out.println("args[2] = " + data3);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutofBoundsExceptionExample   ");
			System.out.print("값1 값2");
		}	//end if-else
		
		
	}	//end main

}	//end class
