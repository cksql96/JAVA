package HackerRank.InterviewPreparation.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class minimumSwaps2_1_2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        
        int min;
        int temp;
        int count = 0;
        
        for(int i = 0; i < arr.length-1; i++) {
            min = i;
            boolean go = false;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                    go = true;
                }   //if
            }   //inner for
            
            if(go) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                count++;
            }   //if
            
        }   //for
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
