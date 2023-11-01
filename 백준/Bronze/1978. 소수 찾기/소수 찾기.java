import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        
        String[] nums = (br.readLine()).split(" ");
        int count = 0;
        
        loop:
        for(String num : nums) {
            int numInt = Integer.parseInt(num);
            
            if(numInt == 1) continue;
            
            for(int i = 2; i < numInt; i++)
                if(numInt % i == 0) continue loop;
            
            count++;
        }
        
        System.out.print(count);
        
		br.close();
	}
}