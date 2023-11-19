import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        
        int a1 = Integer.parseInt(token.nextToken());
        int a0 = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        
        System.out.print((c - a1) * n0 >= a0 && c >= a1 ? 1 : 0);
        
        br.close();
    }
}