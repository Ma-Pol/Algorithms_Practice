import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String[] S = br.readLine().split("");
        int count = 0;
        
        for(String alp : S) {
            if(alp.equals("a") || 
               alp.equals("e") || 
               alp.equals("i") || 
               alp.equals("o") || 
               alp.equals("u"))
                count++;
        }
        
        System.out.print(count);
        
        br.close();
    }
}