import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = (br.readLine()).split(" ");
        int x = Integer.parseInt(nums[0]);
        int y = Integer.parseInt(nums[1]);
        int w = Integer.parseInt(nums[2]);
        int h = Integer.parseInt(nums[3]);
        
        int diff0toX = x;
        int diffXtoW = w - x;
        int diff0toY = y;
        int diffYtoH = h - y;
        
        System.out.print(Math.min(diff0toX, 
                                  Math.min(diffXtoW, 
                                           Math.min(diff0toY, diffYtoH))));
        
        br.close();
    }
}