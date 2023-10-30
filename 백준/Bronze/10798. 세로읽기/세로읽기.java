import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] words = new String[5];
        int maxLength = 0;
        
        for(int cnt = 0; cnt < 5; cnt++) {
            String temp = br.readLine();
            
            if(temp.length() > maxLength) maxLength = temp.length();
            
            words[cnt] = temp;
        }
        
        for(int i = 0; i < maxLength; i++) {
            for(String word : words) {
                if(word.length() - 1 < i) continue;
                
                sb.append(word.substring(i, i + 1));
            }
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}