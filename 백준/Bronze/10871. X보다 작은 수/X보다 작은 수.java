import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int x = Integer.parseInt(((br.readLine()).split(" "))[1]);
        String[] nums = (br.readLine()).split(" ");
        
        for(String num : nums) {
            int temp = Integer.parseInt(num);
            
            if(temp < x) {
                sb.append(num + " ");
            }
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}