package com.zerock.generic.bounded;

public class Util {
	
	//Generic Method
	public static <T extends Number> int compare(T t1, T t2) {
		System.out.println();
		//타입을 더블로 바꿔준다.
		double v1 = t1.doubleValue();
		System.out.println(t1.getClass().getName());
		
		
		double v2 = t2.doubleValue();
		System.out.println(t2.getClass().getName());
		
		return Double.compare(v1, v2);		
		
//		public static int compare(double d1, double d2) {
//	        if (d1 < d2)
//	            return -1;           // Neither val is NaN, thisVal is smaller
//	        if (d1 > d2)
//	            return 1;            // Neither val is NaN, thisVal is larger	
		
	}	//compare

}	//end class
