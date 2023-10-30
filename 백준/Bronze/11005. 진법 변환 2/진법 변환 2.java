import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = (br.readLine()).split(" ");
        long number = Long.parseLong(nums[0]);
        int digits = Integer.parseInt(nums[1]);
        
        System.out.print((Long.toString(number, digits)).toUpperCase());
        
        br.close();
    }
}