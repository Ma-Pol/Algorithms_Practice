import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[10000];
        
        while(N-- > 0)
            numArr[Integer.parseInt(br.readLine()) - 1]++;
        
        
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] == 0) continue;
            
            String num = (i + 1) + "\n";
            
            sb.append(num.repeat(numArr[i]));
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}