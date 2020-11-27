package com.zerock.HackerRankPractice.aaaAlgorithm;

import java.util.Scanner;

public class staircaseSolution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(i = n; i > 0; i--) {
            
            for(j = 0; j < i-1; j++) {
                System.out.print(" ");                
            }   //inner for
            
            for(k = 0; k < n-j; k ++) {
                System.out.print("#");
            }   //inner for
            
            System.out.println();
        }   //for


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
