package ch05;

import java.util.Arrays;

public class ArrayCopyExample {
	
	
	public static void main(String[] args) {
//		String[] oldStrArray = { "java", "array", "copy"};
//		String[] newStrArray = new String[5];
		
		int[] srcArray = {0,1,2,3,4,5,6,7,8,9};
		int[] targetArray = new int[10];
		
		//문제, 3~7까지만 넣어라.
		System.arraycopy(
				srcArray, 						//어떤 배열을 복사할꺼야?
				3, 						//어디부터 복사할꺼야?
				targetArray, 				//이 배열로 복사하겠어.
				0, 					//이 지점부터 넣을꺼야.
				5						//몇개나 복사할꺼야?
				);	//end arraycopy
		
		System.out.println(Arrays.toString(targetArray));
		
		//--------------------------------------------------//
		System.out.println();
		targetArray = 
				Arrays.copyOf(srcArray, 15);
		//arrays를 쓰면, 원래있떤 targetArray의 주소는 사라지고, 새로운 객체로 만들어낸다.
		//원래 쓰던 주소는 garbage가 되어, garbage collector가 삭제시킴.
		
		System.out.println(Arrays.toString(targetArray));

	}	//end main

}	//end class
