import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            boolean isSquareOfTwo = false;
            
            int n = Integer.parseInt(br.readLine());
            
            /*
             * 비트연산자 활용
             * 1 << 0 = 1
             * 1 << 1 = 2
             * 1 << 2 = 4
             * 1 << 3 = 8
             * ...
            */
            for(int i = 0; i < 31; i++)
                if(n == (1 << i)) {
                    isSquareOfTwo = true;
                    break;
                }
            
            System.out.print(isSquareOfTwo ? 1 : 0);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}