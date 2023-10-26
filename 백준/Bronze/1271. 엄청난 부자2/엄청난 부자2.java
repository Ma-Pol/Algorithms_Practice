import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = (br.readLine()).split(" ");
        BigInteger n = new BigInteger(nums[0]);
        BigInteger m = new BigInteger(nums[1]);
        
        // https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html
        // n.divide(m) = n / m
        // n.remainder(m) = n % m
        System.out.println(n.divide(m));
        System.out.print(n.remainder(m));
        
        br.close();
    }
}