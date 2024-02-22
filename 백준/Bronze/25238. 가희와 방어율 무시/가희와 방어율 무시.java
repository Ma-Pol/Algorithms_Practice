import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        double def = Double.parseDouble(input[0]);
        double ign = Double.parseDouble(input[1]);
        
        double realDef = def - (def / 100.0 * ign);
        
        System.out.print(realDef >= 100.0 ? 0 : 1);
        
        br.close();
    }
}