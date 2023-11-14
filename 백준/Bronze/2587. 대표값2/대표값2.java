import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] numArr = new int[5];
        int sum = 0;
        
        for(int i = 0; i < numArr.length; i++) {
            int num = Integer.parseInt(br.readLine());
            
            numArr[i] = num;
            sum += num;
        }
        
        Arrays.sort(numArr);
        
        System.out.print(sb.append(sum / 5).append("\n").append(numArr[2]).toString());
        
        br.close();
    }
}