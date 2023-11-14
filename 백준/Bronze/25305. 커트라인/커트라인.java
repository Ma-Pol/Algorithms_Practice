import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input1 = (br.readLine()).split(" ");
        String[] scoreStr = (br.readLine()).split(" ");
        int N = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        Integer[] score = new Integer[N];
        
        for(int i = 0; i < N; i++)
            score[i] = Integer.parseInt(scoreStr[i]);
        
        Arrays.sort(score, Collections.reverseOrder());
        
        System.out.print(score[k - 1]);        
        
        br.close();
    }
}