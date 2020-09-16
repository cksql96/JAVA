package TeamAssignment;

import java.util.Scanner;


/* 1. 값을 입력했을때 어느 데이터타입에 들어가는지 확인
 * 2. 받은 값을 범위 측정하자
 * 3. 범위내에 들어오면 범위내 데이터타입을 출력하자 
 * 4. 범위를 벗어나면 skip하고 에러 발생시 catch문에서 예외처리문을 수행한다
 */

public class assignment06 {

	public static void main(String []argh)
    {
		Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	
	    for(int i=0;i<t;i++)
	    {
	    	
	        try
	        {
	            long x=sc.nextLong();
	            System.out.println(x+" can be fitted in:");
	            	            	            
	            if(x>= Byte.MIN_VALUE && x<= Byte.MAX_VALUE) {
	            	System.out.println("* byte");
	            } 
	            if(x>= Short.MIN_VALUE && x<= Short.MAX_VALUE){
	            	System.out.println("* short");
	            }
	            if(x>= Integer.MIN_VALUE && x<= Integer.MAX_VALUE){
	            	System.out.println("* int");
	            }
	            if(x>= Long.MIN_VALUE && x<= Long.MAX_VALUE){
	            	System.out.println("* long");
	            }
	            
	            //Complete the code
	           
	            }	//end try
	        
	        catch(Exception e)
	        {
	            System.out.println(sc.next()+" can't be fitted anywhere.");
	            e.printStackTrace();
	        }	//end catch	        
	
	    }	//end for
	    
	    sc.close();
	    
    }	//end main
	
}	//end class
