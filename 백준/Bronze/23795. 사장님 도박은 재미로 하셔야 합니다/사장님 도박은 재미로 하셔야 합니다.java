import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalMoney = 0;
        
        while(true) {
            int betMoney = Integer.parseInt(br.readLine());
            
            if(betMoney == -1) break;
            
            totalMoney += betMoney;
        }
        
        System.out.print(totalMoney);
        
        br.close();
    }
}