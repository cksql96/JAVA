package teamassignment;

import java.util.Scanner;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class TeamAssignment09 {
	
	
	static {		
		try(Scanner sc = new Scanner(System.in);)
		{		
			int breadth = 0;
			int height = 0;
			log.info("Enter breadth");
			breadth = sc.nextInt();
			log.info("Enter height");
			height = sc.nextInt();
			if(breadth <=0 || height <=0) {
				throw new Exception("Breadth and height must be positive");
			}
			log.info("The Area is: " + (breadth * height));
		}catch(Exception e){
//			log.info("java.lang.Exception: Breadth and height must be positive");
			e.printStackTrace();
		}	//try -catch		
		
	}	//static initializer
	
	//----------------MAIN----------------//
	public static void main(String[] args) {
		
	}	//end main

}	//end class
