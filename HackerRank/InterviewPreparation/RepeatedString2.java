package HackerRank.InterviewPreparation.warmup;

import java.util.Scanner;

//이것은 out of memory가 안뜬다.
public class RepeatedString2 {
	
	
	static long repeatedString(String s, long n) {
		
		/**
		 * 예를 들어
		 * s = abcaea 
		 * n = 20		
		**/
		long size = s.length();				/**						6	**/	
		long repeated = n/size;				/**20 / 6 			=	3	**/
        long left = n - (size * repeated);	/**20 - (6 * 3) 	= 	2	**/
        
        long result = 0;
        int extra = 0;
        int count = 0;
        
        for(int i = 0; i < size; i++){		/**s를 전체 순회(6)			**/
        	
            if(s.charAt(i) == 'a'){			
                count++;					/**abcaea-> 3	count = 3	**/
            }	//if
        }	//for

        for(int i = 0; i < left; i++){		/**s에서 left(2)만큼순회		**/
        	
            if(s.charAt(i) == 'a'){			
                extra++;					/**ab -> 1	extra = 1	**/
            }	//if
        }	//for

        //result = (반복된 횟수 * String에서 count된 a개수) + 나머지값에서 구해진 a개수
        result = (repeated * count) + extra;	/**(3 * 3) + 1	=10		**/

        return result;
		
	}	//repeatedString
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		long n = sc.nextLong();
		
		sc.close();
		
		long result = repeatedString(s, n);
		
		
		System.out.println(result);
		
		
	}	//end main

}	//end class
