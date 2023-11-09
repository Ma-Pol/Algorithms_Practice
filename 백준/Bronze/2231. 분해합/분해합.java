import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int number = 1, result = 0;
        
        while(number < N) {
            int tempNum = number++;
            int sum = tempNum;
            
            while(tempNum != 0) {
                sum += tempNum % 10;
                tempNum /= 10;
            }
            
            if(sum == N) {
                result = --number;
                break;
            }
        }
        
        System.out.print(result);
        
        br.close();
    }
}