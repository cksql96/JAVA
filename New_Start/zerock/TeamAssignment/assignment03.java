package TeamAssignment;

import java.util.Scanner;

public class assignment03 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        in.reset();
        
        System.out.println("이걸 몇번 수행할래?");
        int t=in.nextInt();
        System.out.println("a값, b값, n값을 넣어라.");
        
        for(int i=0;i<t;i++){
        	
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            
            for(int j= 0; j<n; j++) {
            	result +=  (int)Math.pow(2, j) * b;
            	
            	System.out.print(result + " ");
            }
            
            System.out.println();
        } // end for
        
        
        in.close();
		
	}
	

}
