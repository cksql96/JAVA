package ch10;

import java.util.Scanner;

public class TTT5 {
	
	//try-with-resources;;;; try() 소괄호 안에 자원객체를 선언 및 정의해준다. 그러면 알아서 close해준다.
	public static void main(String[] args) {

		Scanner sc4 = null;
		String a = "";
		
		try(	Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);
				//sc4 = new Scanner(System.in);		자원객체는 밖에서 선언하면 소괄호안에 정의를 못해준다.
		) {		
			System.out.println("암거나 넣어바");
			a = sc1.nextLine();
		}//try-with-resources
		catch(NullPointerException | NumberFormatException e){
			;;
		}
		catch(Exception e) {
			;;
		}
		finally {
			System.out.println(a);
		}
		
	}	//end main

}	//end class
