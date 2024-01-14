import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        
        int sumSecond = a + b + c + d;
        int minute = sumSecond / 60;
        int second = sumSecond % 60;
        
        System.out.println(minute);
        System.out.print(second);
        
        br.close();
    }
}