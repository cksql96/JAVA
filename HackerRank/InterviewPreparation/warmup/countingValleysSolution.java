package HackerRank.InterviewPreparation.warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int start = 0;
        int UorD = 0;
        int count = 0;
        
        char[] aaa = path.toCharArray();
        
        
        for(int i = 0; i < steps; i ++) {
            int valley = UorD;
            
            if(aaa[i] == 'U'){
                UorD++;
            } else if(aaa[i] == 'D'){
                UorD--;   
            }   //if-else
            
            if(start == UorD && valley < 0) {
                count++;
            }   //if
            
        }   //for
        
        return count;

    }

}

public class countingValleysSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
