import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            int n = Integer.parseInt(br.readLine());
            int[] std = new int[n];
            int[] count = new int[1000001];
            
            for(int i = 0; i < n; i++) {
                int num = std[i] = Integer.parseInt(br.readLine());
                count[num]++;
            }
            
            for(int i = 0; i < n; i++) {
                int temp = std[i];
                int cnt = 0;
                
                for(int j = 1; j * j <= temp; j++) {
                    if(temp % j == 0) {
                        cnt += count[j];
                        
                        if (j * j < temp)
                            cnt += count[temp / j];
                    }
                }
                
                sb.append(cnt - 1).append("\n");
            }
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}