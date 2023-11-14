import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        
        for(int i = 0; i < N; i++)
            numArr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(numArr);
        
        for(int num : numArr)
            sb.append(num).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}