package HackerRank.InterviewPreparation.warmup;

import java.util.Scanner;

//이것은 out of memory가 뜬다.
public class RepeatedString {
	
	
	static long repeatedString(String s, long n) {
		
		char[] temp = null;		
		long count = 0;
		
		if(s.length() == n) {
			temp = s.toCharArray();
		} else {
			
			while(s.length() <= n) {
				s = s+s;
			}	//while
			
			if(s.length() > n) {
				int a = (int)n;
				s = s.substring(0, a);
			}	//if
			
			temp = s.toCharArray();
		}	//if-else
		
		
		for(int i : temp) {			
			
			if(i == 'a') {
				count++;
			}	//if			
		}	//enhanced for
			
		return count;		
		
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
