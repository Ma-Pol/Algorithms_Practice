import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nextNum = br.readLine();
        int maxNum = 0, maxNumCount = 0, count = 1;
        
        while(nextNum != null) {
            int temp = Integer.parseInt(nextNum);
            
            if(maxNum < temp) {
                maxNum = temp;
                maxNumCount = count;
            }
            
            nextNum = br.readLine();
            count++;
        }
        
        System.out.println(maxNum);
        System.out.print(maxNumCount);
        
        br.close();
    }
}