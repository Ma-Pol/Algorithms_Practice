import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int v = Integer.parseInt(br.readLine());
            char[] input = br.readLine().toCharArray();
            Arrays.sort(input);
            
            String answer;
            
            if(v % 2 == 0 && input[(v - 1) / 2] != input[v / 2]) {
                answer = "Tie";
            } else {
                answer = Character.toString(input[v / 2]);
            }
            
            System.out.print(answer);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}