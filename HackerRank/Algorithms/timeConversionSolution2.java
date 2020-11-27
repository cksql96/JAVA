package com.zerock.HackerRankPractice.aaaAlgorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class timeConversionSolution2 {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        Date result = new Date();
        
        try {
        	result =  df.parse(s);
        
        } catch (Exception e) { 
        	;;
        }	//try-catch
        
        DateFormat dr =  new SimpleDateFormat("HH:mm:ss");
        
        return (String) dr.format(result);

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
