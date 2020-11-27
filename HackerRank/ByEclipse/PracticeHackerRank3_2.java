package com.zerock.TTT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class PracticeHackerRank3_2 {

	public static void main(String[] args) {
		
		String s = "04:01:00AM";
		
		DateFormat df = new SimpleDateFormat("hh:mm:ssa", Locale.ENGLISH);
		
        Date result = null;
        
		try {
			result = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        DateFormat dr =  new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        
        System.out.println(dr.format(result));
        
	}	//end main

}	//end class
