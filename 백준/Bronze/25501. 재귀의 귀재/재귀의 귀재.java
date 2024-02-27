import java.io.*;

public class Main {
    public static int count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String S = br.readLine();
            
            sb.append(isPalindrome(S)).append(" " + count + "\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
    
    public static int isPalindrome(String str) {
        count = 0;
        
        return recursion(str, 0, str.length() - 1);
    }
    
    public static int recursion(String str, int left, int right) {
        count++;
        if(left >= right) return 1;
        else if(str.charAt(left) != str.charAt(right)) return 0;
        else return recursion(str, left + 1, right - 1);
    }
}