package ch10;

public class TTT2 {
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Try block");
			String number="a100";
			int intNumber = Integer.parseInt(number);
			
			String a = null;
			System.out.println(a.toString());
			
		} 
		catch(NumberFormatException | NullPointerException e){
			System.out.println("Catch block");
			
			if(e instanceof NumberFormatException) {
				System.out.println("NumberFormatException 입니다.");
			}else {
				System.out.println("NullPointerException 입니다.");
			}	//end if-else
			
		}	//멀티 catch.... catch문 두개 쓰는건, 다중 catch.
		finally {
			System.out.println("--------------");
			System.out.println("   FINALLY    ");
			System.out.println("--------------");
		}	//end try-catch-finally
		
		System.out.println("catch가 있으면 빠져나오지만 catch가 없으면 오류떠서 이건 안나온다!!");
		
	}	//end main

}	//end class
