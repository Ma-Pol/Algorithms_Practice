import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] alphabet = null;
        
        int N = Integer.parseInt(br.readLine());
        int count = N;
        
        for(int i = 0; i < N; i++) {
            alphabet = new boolean[26];
            char[] tempStr = (br.readLine()).toCharArray();
            
            for(int j = 0; j < tempStr.length; j++) {
                int temp = (int) tempStr[j];
                
                if(j != 0 && tempStr[j] == tempStr[j - 1]) {
                    continue;
                }
                
                if(alphabet[temp - 97]) {
                    count--;
                    break;
                }
                
                alphabet[temp - 97] = true;
            }
        }
        
        System.out.print(count);
        
        br.close();
    }
}