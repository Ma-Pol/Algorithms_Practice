import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alp = new int[26];
        
        char[] S = br.readLine().toCharArray();
        
        for(char ch : S) {
            int chInt = (int) ch;
            alp[ch - 97]++;
        }
        
        for(int count : alp) {
            sb.append(count).append(" ");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}