package ch10;

public class TTT3 {
	
	
	public static void main(String[] args) {
		
		try {
			// 개발자가 직접 예외를 발생시키는 문법!!
			throw new IllegalStateException("Wow");
			
		}catch(NumberFormatException | NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("\n--------------");
			System.out.println("   FINALLY    ");
			System.out.println("--------------\n");
		}	//end try-catch-finally
		
	}	//end main

}	//end class
