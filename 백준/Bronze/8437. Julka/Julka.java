import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger apples = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger median = null;
        BigInteger Klaudia = null;
        BigInteger Natalia = null;
        
        if(apples.remainder(two).equals(zero)) {
            median = apples.divide(two);
            Klaudia = median.add(diff.divide(two));
            Natalia = median.subtract(diff.divide(two));
        } else {
            median = apples.divide(two);
            Klaudia = median.add(diff.divide(two)).add(one);
            Natalia = median.subtract(diff.divide(two));
        }
        
        System.out.println(Klaudia);
        System.out.print(Natalia);
        
        br.close();
    }
}