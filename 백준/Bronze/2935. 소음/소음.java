import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger n1 = new BigInteger(br.readLine());
            
            String oper = br.readLine();
            
            BigInteger result;
            
            if(oper.equals("+"))
                result = n1.add(new BigInteger(br.readLine()));
            else
                result = n1.multiply(new BigInteger(br.readLine()));
            
            System.out.print(result);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}