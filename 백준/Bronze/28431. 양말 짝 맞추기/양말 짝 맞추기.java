import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = 5;
        String soxs = "";
        
        while(N-- > 0) {
            String temp = br.readLine();
            
            if(soxs.contains(temp)) {
                soxs = soxs.replaceFirst(temp, "");
            } else {
                soxs += temp;
            }
        }
        
        System.out.print(soxs);
        
        br.close();
    }
}