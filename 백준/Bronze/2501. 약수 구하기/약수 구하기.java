import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = (br.readLine()).split(" ");
        int number = Integer.parseInt(nums[0]);
        int th = Integer.parseInt(nums[1]);
        int count = 0;
        
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) 
                count++;
            
            if(count == th) {
                System.out.print(i);
                break;
            }
        }
        
        if(count < th)
            System.out.print(0);
        
        br.close();
    }
}