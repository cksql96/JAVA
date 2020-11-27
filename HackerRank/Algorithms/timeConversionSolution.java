package com.zerock.HackerRankPractice.aaaAlgorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class timeConversionSolution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String hourMinSec = s.substring(0,8);
        
        System.out.println("hourMinSec: " + hourMinSec);
        
        String minSec = hourMinSec.substring(2);
        
        System.out.println("minSec: " + minSec);
        
        String[] getHourArr = hourMinSec.split(":");
        
        System.out.println("getHourArr: " + Arrays.toString(getHourArr));
        
        
        int hour = Integer.parseInt(getHourArr[0]);        
        
        if(s.charAt(8) == 'P' && hour != 12) {
            System.out.println("1번째 if문");
            hour += 12;            
            return hour + minSec;
            
        } else if(s.charAt(8) == 'P' && hour == 12) {
            System.out.println("2번째 if문");
            return hour + minSec;
            
        } else if(s.charAt(8) == 'A' && hour == 12) {
            System.out.println("3번째 if문");
            
            hour -= 12;            
            String test = Integer.toString(hour);
            test = "" + "0" + test;
            
            return test + minSec;
            
        } else if(hour < 10 && s.charAt(8) == 'A' && hour != 12)  {
            System.out.println("4번째 if문");
            
            String test = Integer.toString(hour);
            test = "" + "0" + test;
            
            return test + minSec;
            
        } else {
            System.out.println("else문");
            return hour + minSec;
            
        }    //else    

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
