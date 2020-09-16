package TeamAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class assignment07_01 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
        
	}	//end main
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		//선언들.
		int n1 = a.length();
		int n2 = b.length();
		
		if(n1 != n2) {
			return false;
		}
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
			return true;
		}else {
			return false;
		}	
		
        
    }	//end isAnagram Method
	
}	//end class
