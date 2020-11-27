package com.zerock.HackerRankPractice.aaaAlgorithm;

import java.util.Scanner;

public class miniMaxSumSolution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int count = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(int j = 0; j < arr.length; j++) {
            long sum = 0;            
            
            for(int i = 0; i < arr.length; i++) {
                
                if(i == count) {
                    continue;
                } else {
                    sum += arr[i];
                }    //if-else
                                
            }    //inner for
            
            count ++;
            
            if(min > sum) {
                min = sum;
            }    //if
            
            if(max < sum) {
                max = sum;
            }    //if
            
        }    //for
        
        System.out.print(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
