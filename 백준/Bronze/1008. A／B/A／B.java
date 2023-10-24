import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nums = br.readLine();
        
        String[] numArr = nums.split(" ");
        
        System.out.print(Double.parseDouble(numArr[0]) / Double.parseDouble(numArr[1]));
        
        br.close();
    }
}