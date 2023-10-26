import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int maxNum = -10000000;
        int minNum = 1000000;
        
        br.readLine();
        String[] nums = (br.readLine()).split(" ");
        
        for(String num : nums) {
            int temp = Integer.parseInt(num);
            
            maxNum = temp > maxNum ? temp : maxNum;
            minNum = temp < minNum ? temp : minNum;
        }
        
        System.out.print(sb.append(minNum).append(" ").append(maxNum).toString());
        
        br.close();
    }
}