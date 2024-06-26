import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            Arrays.sort(nums);
            
            System.out.print(nums[1]);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}