import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger apples = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger median = null;
        BigInteger Klaudia = null;
        BigInteger Natalia = null;
        
        if(apples.remainder(new BigInteger("2")).equals(new BigInteger("0"))) {
            median = apples.divide(new BigInteger("2"));
            Klaudia = median.add(diff.divide(new BigInteger("2")));
            Natalia = median.subtract(diff.divide(new BigInteger("2")));
        } else {
            median = apples.divide(new BigInteger("2"));
            Klaudia = median.add(diff.divide(new BigInteger("2"))).add(new BigInteger("1"));
            Natalia = median.subtract(diff.divide(new BigInteger("2")));
        }
        
        System.out.println(Klaudia);
        System.out.print(Natalia);
        
        br.close();
    }
}