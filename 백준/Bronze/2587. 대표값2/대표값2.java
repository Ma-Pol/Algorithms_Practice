import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] numArr = new int[5];
        int cnt = 0, sum = 0, median = 0;
        
        for(int i = 0; i < numArr.length; i++)
            numArr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(numArr);
        
        for(int num : numArr) {
            sum += num;
            
            if(cnt++ == 2)
                median = num;
        }
        
        System.out.print(sb.append(sum / 5).append("\n").append(median).toString());
        
        br.close();
    }
}