package TeamAssignment;

import java.util.Scanner;

public class assignment07_02 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a값넣어라");
        String a = sc.nextLine();
        
        System.out.println("b값 넣어라");
        String b = sc.nextLine();
        
        sc.close();
         
        a = a.toLowerCase();
        b = b.toLowerCase();
		 
        boolean aa = isAnagram(a,b);
        
        System.out.println( (aa) ? "Anagrams" : "Not Anagrams" );
		
        
	}	//end main
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		//선언들.
		char[] alpa = new char[26];
        int[] count = new int[26];
        int[] count1 = new int[26];
	 
        for (int i = 0; i < alpa.length; i++) {
        	
            alpa[i] = (char) (i + 97);  // 알파벳소문자 생성 
            
        }	//end for
        
        //------------------a에 알파벳 몇개있나 세어보기 for loop(아래)-----------------//
        
        for (int i = 0; i < alpa.length; i++) {
        	
            for (int j = 0; j < a.length(); j++) {
            	
                if (alpa[i] == a.charAt(j)) {
                    count[i]++;			//alpa[i]에 해당하는 알파벳에 count[i]값을 1 올려준다..
                }	//end if
                
            }	//end for
            
        }	//end for
        
        System.out.println("----------------------------------------------------");
                
        for (int i = 0; i < alpa.length; i++) {
        	
            for (int j = 0; j < b.length(); j++) {
            	
                if (alpa[i] == b.charAt(j)) {
                    count1[i]++;
                }	//end if
                
            }	//end for
            
        }	//end for
        
        System.out.println("a에서 추출한 알파벳 \t\t\tb에서 추출한 알파벳 \n");
        for (int i = 0; i < count1.length; i++) {
        	
        	if(count1[i] != 0 ) {
        		System.out.println(
        				alpa[i] + "의 개수 : " + count[i] + "\t\t\t" + 
        						alpa[i] + "의 개수 : " + count1[i]);
        	}  //end if
        	
        }	//end for
        System.out.println("----------------------------------------------------");
        
        boolean same = true;
        
        for(int i = 0; i < alpa.length; i++ ) {
        	
        	if(count[i] != 0 || count1[i] != 0) {
        		same = count[i] == count1[i];
        		
        		if(same == false) {
        			break;
        		}	//end if
        		
        	}	//end if
        	
        }	//end for
        
        return same;
        
    }	//end isAnagram Method
	
}	//end class
