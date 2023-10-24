import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nums = br.readLine();
        
        String[] numArr = nums.split(" ");
        
        int a = Integer.parseInt(numArr[0]);
        int b = Integer.parseInt(numArr[1]);
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        br.close();
    }
}